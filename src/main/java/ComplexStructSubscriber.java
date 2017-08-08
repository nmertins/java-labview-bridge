import us.ihmc.idl.generated.ComplexType;
import us.ihmc.idl.generated.ComplexTypePubSubType;
import us.ihmc.pubsub.Domain;
import us.ihmc.pubsub.DomainFactory;
import us.ihmc.pubsub.attributes.*;
import us.ihmc.pubsub.common.LogLevel;
import us.ihmc.pubsub.common.MatchingInfo;
import us.ihmc.pubsub.common.SampleInfo;
import us.ihmc.pubsub.participant.Participant;
import us.ihmc.pubsub.subscriber.Subscriber;
import us.ihmc.pubsub.subscriber.SubscriberListener;

import java.io.IOException;

/**
 * This class reads the complex type published by the LabView example application
 * 'RTI Connext DDS Cluster Writer.vi'.
 */
public class ComplexStructSubscriber
{
   private class ComplexStructSubscriberListener implements SubscriberListener
   {
      private final ComplexType message = new ComplexType();
      private final SampleInfo info = new SampleInfo();

      @Override
      public void onNewDataMessage(Subscriber subscriber)
      {
         try
         {
            if(subscriber.takeNextData(message, info))
            {
               System.out.println("Recieved: " + message.toString());
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

   public ComplexStructSubscriber() throws IOException
   {
      Domain domain = DomainFactory.getDomain(DomainFactory.PubSubImplementation.FAST_RTPS);
      domain.setLogLevel(LogLevel.INFO);

      ParticipantAttributes participantAttributes = domain.createParticipantAttributes(0, "SubscriberExample");
      Participant participant = domain.createParticipant(participantAttributes);

      ComplexTypePubSubType dataType = new ComplexTypePubSubType();
      dataType.getKey(new ComplexType(), null);
      domain.registerType(participant, dataType);

      SubscriberAttributes subscriberAttributes = domain.createSubscriberAttributes(participant, dataType, "HelloComplex",
            ReliabilityKind.RELIABLE, null);
      subscriberAttributes.getQos().setDurabilityKind(DurabilityKind.VOLATILE_DURABILITY_QOS);
      subscriberAttributes.getTopic().getHistoryQos().setKind(HistoryQosPolicy.HistoryQosPolicyKind.KEEP_LAST_HISTORY_QOS);
      subscriberAttributes.getTopic().setTopicKind(TopicAttributes.TopicKind.WITH_KEY);

      domain.createSubscriber(participant, subscriberAttributes, new ComplexStructSubscriberListener());

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
      new ComplexStructSubscriber();
   }
}
