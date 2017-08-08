package us.ihmc.idl.generated;

import java.io.IOException;

import us.ihmc.pubsub.TopicDataType;
import us.ihmc.pubsub.common.SerializedPayload;
import us.ihmc.idl.InterchangeSerializer;
import us.ihmc.idl.CDR;
import us.ihmc.idl.IDLSequence;

/**
* 
* Topic data type of the struct "superinnerClusterType" defined in "DDS_Cluster.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DDS_Cluster.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DDS_Cluster.idl instead.
*
*/
public class superinnerClusterTypePubSubType implements TopicDataType<us.ihmc.idl.generated.superinnerClusterType>
{
	public static final String name = "superinnerClusterType";
	
	
	
    public superinnerClusterTypePubSubType()
    {
        
    }

	private final CDR serializeCDR = new CDR();
	private final CDR deserializeCDR = new CDR();

    
    @Override
   public void serialize(us.ihmc.idl.generated.superinnerClusterType data, SerializedPayload serializedPayload) throws IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }
   @Override
   public void deserialize(SerializedPayload serializedPayload, us.ihmc.idl.generated.superinnerClusterType data) throws IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }
   
	public static int getMaxCdrSerializedSize()
	{
		return getMaxCdrSerializedSize(0);
	}

	public static int getMaxCdrSerializedSize(int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += 8 + CDR.alignment(current_alignment, 8);

	    current_alignment += us.ihmc.idl.generated.ultrainnerClusterTypePubSubType.getMaxCdrSerializedSize(current_alignment);
	
	    return current_alignment - initial_alignment;
	}


	public final static int getCdrSerializedSize(us.ihmc.idl.generated.superinnerClusterType data)
	{
		return getCdrSerializedSize(data, 0);
	}

	public final static int getCdrSerializedSize(us.ihmc.idl.generated.superinnerClusterType data, int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += 8 + CDR.alignment(current_alignment, 8);

	    current_alignment += us.ihmc.idl.generated.ultrainnerClusterTypePubSubType.getCdrSerializedSize(data.getUltrainnerCluster(), current_alignment);
	
	    return current_alignment - initial_alignment;
	}
	
   public static void write(us.ihmc.idl.generated.superinnerClusterType data, CDR cdr)
   {

	    cdr.write_type_6(data.getDbl_Num());

	    us.ihmc.idl.generated.ultrainnerClusterTypePubSubType.write(data.getUltrainnerCluster(), cdr);
   }

   public static void read(us.ihmc.idl.generated.superinnerClusterType data, CDR cdr)
   {

	    	data.setDbl_Num(cdr.read_type_6());
	    	

	    	us.ihmc.idl.generated.ultrainnerClusterTypePubSubType.read(data.getUltrainnerCluster(), cdr);	
   }
   
	@Override
	public final void serialize(us.ihmc.idl.generated.superinnerClusterType data, InterchangeSerializer ser)
	{
			    ser.write_type_6("Dbl_Num", data.getDbl_Num());
			    
			    ser.write_type_a("ultrainnerCluster", new us.ihmc.idl.generated.ultrainnerClusterTypePubSubType(), data.getUltrainnerCluster());

			    
	}
	
	@Override
	public final void deserialize(InterchangeSerializer ser, us.ihmc.idl.generated.superinnerClusterType data)
	{
	    			data.setDbl_Num(ser.read_type_6("Dbl_Num"));	
	    	    
	    			ser.read_type_a("ultrainnerCluster", new us.ihmc.idl.generated.ultrainnerClusterTypePubSubType(), data.getUltrainnerCluster());
	    	
	    	    
	}

   public static void staticCopy(us.ihmc.idl.generated.superinnerClusterType src, us.ihmc.idl.generated.superinnerClusterType dest)
   {
      dest.set(src);
   }
   
   
   @Override
   public us.ihmc.idl.generated.superinnerClusterType createData()
   {
      return new us.ihmc.idl.generated.superinnerClusterType();
   }
      

   @Override
   public int getTypeSize()
   {
      return CDR.getTypeSize(getMaxCdrSerializedSize());
   }

   @Override
   public String getName()
   {
      return name;
   }
   
   public void serialize(us.ihmc.idl.generated.superinnerClusterType data, CDR cdr)
	{
		write(data, cdr);
	}

   public void deserialize(us.ihmc.idl.generated.superinnerClusterType data, CDR cdr)
   {
        read(data, cdr);
   }
   
   public void copy(us.ihmc.idl.generated.superinnerClusterType src, us.ihmc.idl.generated.superinnerClusterType dest)
   {
      staticCopy(src, dest);
   }	

   
   @Override
   public superinnerClusterTypePubSubType newInstance()
   {
   	  return new superinnerClusterTypePubSubType();
   }
}