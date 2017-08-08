import us.ihmc.idl.generated.DDS_Double;
import us.ihmc.idl.generated.DDS_DoublePubSubType;
import us.ihmc.pubsub.Domain;
import us.ihmc.pubsub.DomainFactory;
import us.ihmc.pubsub.attributes.*;
import us.ihmc.pubsub.common.LogLevel;
import us.ihmc.pubsub.common.MatchingInfo;
import us.ihmc.pubsub.common.Time;
import us.ihmc.pubsub.participant.Participant;
import us.ihmc.pubsub.participant.ParticipantDiscoveryInfo;
import us.ihmc.pubsub.participant.ParticipantListener;
import us.ihmc.pubsub.publisher.Publisher;
import us.ihmc.pubsub.publisher.PublisherListener;

import java.io.IOException;
import java.util.Random;

/**
 * This class publishes random doubles that can be read by running the LabView example application
 * 'RTI Connext DDS Read Double.vi'.
 */
public class SimpleDoublePublisher
{
   private final Random random = new Random(234789);

   private class ParticipantListenerImpl implements ParticipantListener
   {
      @Override
      public void onParticipantDiscovery(Participant participant, ParticipantDiscoveryInfo info)
      {
      }
   }

   private class DoublePublisherImpl implements PublisherListener
   {
      @Override
      public void onPublicationMatched(Publisher publisher, MatchingInfo info)
      {
      }
   }

   public SimpleDoublePublisher() throws IOException
   {
      Domain domain = DomainFactory.getDomain(DomainFactory.PubSubImplementation.FAST_RTPS);
      domain.setLogLevel(LogLevel.INFO);

      ParticipantAttributes attributes = domain.createParticipantAttributes();
      attributes.setDomainId(0);
      attributes.setLeaseDuration(Time.Infinite);
      attributes.setName("PublisherExample");
      Participant participant = domain.createParticipant(attributes, new ParticipantListenerImpl());

      DDS_DoublePubSubType dataType = new DDS_DoublePubSubType();
      domain.registerType(participant, dataType);

      PublisherAttributes publisherAttributes = domain.createPublisherAttributes(participant, dataType, "Hello LV Double",
            ReliabilityKind.RELIABLE, null);
      publisherAttributes.getQos().setDurabilityKind(DurabilityKind.VOLATILE_DURABILITY_QOS);
      publisherAttributes.getTopic().getHistoryQos().setKind(HistoryQosPolicy.HistoryQosPolicyKind.KEEP_ALL_HISTORY_QOS);
      publisherAttributes.getTopic().getHistoryQos().setDepth(50);

      Publisher publisher = domain.createPublisher(participant, publisherAttributes, new DoublePublisherImpl());

      DDS_Double message = new DDS_Double();

      while(true)
      {
         try
         {
            double value = random.nextDouble();
            System.out.println("Publishing: " + value);
            message.setValue(value);
            publisher.write(message);
            Thread.sleep(1000);
         }
         catch(InterruptedException e)
         {
         }
      }
   }

   public static void main(String[] args) throws IOException
   {
      new SimpleDoublePublisher();
   }
}
