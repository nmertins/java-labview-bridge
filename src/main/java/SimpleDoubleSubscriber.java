import us.ihmc.idl.generated.DDS_Double;
import us.ihmc.idl.generated.DDS_DoublePubSubType;
import us.ihmc.pubsub.Domain;
import us.ihmc.pubsub.DomainFactory;
import us.ihmc.pubsub.attributes.*;
import us.ihmc.pubsub.common.LogLevel;
import us.ihmc.pubsub.common.MatchingInfo;
import us.ihmc.pubsub.common.SampleInfo;
import us.ihmc.pubsub.common.Time;
import us.ihmc.pubsub.participant.Participant;
import us.ihmc.pubsub.participant.ParticipantDiscoveryInfo;
import us.ihmc.pubsub.participant.ParticipantListener;
import us.ihmc.pubsub.subscriber.Subscriber;
import us.ihmc.pubsub.subscriber.SubscriberListener;

import java.io.IOException;

public class SimpleDoubleSubscriber
{
   private class ParticipantListenerImpl implements ParticipantListener
   {
      @Override
      public void onParticipantDiscovery(Participant participant, ParticipantDiscoveryInfo info)
      {
      }
   }

   private class DoubleSubscriberImpl implements SubscriberListener
   {
      private final DDS_Double message = new DDS_Double();
      private final SampleInfo info = new SampleInfo();

      @Override
      public void onNewDataMessage(Subscriber subscriber)
      {
         try
         {
            if(subscriber.takeNextData(message,info))
            {
               double value = message.getValue();
               System.out.println("Received: " + value);
            }
         }
         catch(IOException e)
         {
            e.printStackTrace();
         }
      }

      @Override
      public void onSubscriptionMatched(Subscriber subscriber, MatchingInfo info)
      {

      }
   }

   public SimpleDoubleSubscriber() throws IOException
   {
      Domain domain = DomainFactory.getDomain(DomainFactory.PubSubImplementation.FAST_RTPS);
      domain.setLogLevel(LogLevel.INFO);

      ParticipantAttributes attributes = domain.createParticipantAttributes();
      attributes.setDomainId(0);
      attributes.setLeaseDuration(Time.Infinite);
      attributes.setName("SubscriberExample");
      Participant participant = domain.createParticipant(attributes, new ParticipantListenerImpl());

      DDS_DoublePubSubType dataType = new DDS_DoublePubSubType();
      domain.registerType(participant, dataType);

      SubscriberAttributes subscriberAttributes = domain.createSubscriberAttributes(participant, dataType, "Hello LV Double",
            ReliabilityKind.RELIABLE, null);
      subscriberAttributes.getQos().setDurabilityKind(DurabilityKind.VOLATILE_DURABILITY_QOS);
      subscriberAttributes.getTopic().getHistoryQos().setKind(HistoryQosPolicy.HistoryQosPolicyKind.KEEP_ALL_HISTORY_QOS);

      domain.createSubscriber(participant, subscriberAttributes, new DoubleSubscriberImpl());

      while(true)
      {
         try
         {
            Thread.sleep(1000);
         }
         catch(InterruptedException e)
         {
         }
      }
   }

   public static void main(String[] args) throws IOException
   {
      new SimpleDoubleSubscriber();
   }
}
