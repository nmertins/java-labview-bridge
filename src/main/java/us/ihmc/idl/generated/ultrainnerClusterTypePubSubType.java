package us.ihmc.idl.generated;

import java.io.IOException;

import us.ihmc.pubsub.TopicDataType;
import us.ihmc.pubsub.common.SerializedPayload;
import us.ihmc.idl.InterchangeSerializer;
import us.ihmc.idl.CDR;
import us.ihmc.idl.IDLSequence;

/**
* 
* Topic data type of the struct "ultrainnerClusterType" defined in "DDS_Cluster.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DDS_Cluster.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DDS_Cluster.idl instead.
*
*/
public class ultrainnerClusterTypePubSubType implements TopicDataType<us.ihmc.idl.generated.ultrainnerClusterType>
{
	public static final String name = "ultrainnerClusterType";
	
	
	
    public ultrainnerClusterTypePubSubType()
    {
        
    }

	private final CDR serializeCDR = new CDR();
	private final CDR deserializeCDR = new CDR();

    
    @Override
   public void serialize(us.ihmc.idl.generated.ultrainnerClusterType data, SerializedPayload serializedPayload) throws IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }
   @Override
   public void deserialize(SerializedPayload serializedPayload, us.ihmc.idl.generated.ultrainnerClusterType data) throws IOException
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
	            
	    current_alignment += 4 + CDR.alignment(current_alignment, 4);
	    current_alignment += (2 * 2) + CDR.alignment(current_alignment, 2);

	
	    return current_alignment - initial_alignment;
	}


	public final static int getCdrSerializedSize(us.ihmc.idl.generated.ultrainnerClusterType data)
	{
		return getCdrSerializedSize(data, 0);
	}

	public final static int getCdrSerializedSize(us.ihmc.idl.generated.ultrainnerClusterType data, int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += 4 + CDR.alignment(current_alignment, 4);
	    current_alignment += (data.getI16_Array().size() * 2) + CDR.alignment(current_alignment, 2);

	
	    return current_alignment - initial_alignment;
	}
	
   public static void write(us.ihmc.idl.generated.ultrainnerClusterType data, CDR cdr)
   {

	    if(data.getI16_Array().size() <= 2)
	    cdr.write_type_e(data.getI16_Array());else
	        throw new RuntimeException("I16_Array field exceeds the maximum length");
   }

   public static void read(us.ihmc.idl.generated.ultrainnerClusterType data, CDR cdr)
   {

	    	cdr.read_type_e(data.getI16_Array());	
   }
   
	@Override
	public final void serialize(us.ihmc.idl.generated.ultrainnerClusterType data, InterchangeSerializer ser)
	{
			    ser.write_type_e("I16_Array", data.getI16_Array());
			    
	}
	
	@Override
	public final void deserialize(InterchangeSerializer ser, us.ihmc.idl.generated.ultrainnerClusterType data)
	{
	    			ser.read_type_e("I16_Array", data.getI16_Array());	
	    	    
	}

   public static void staticCopy(us.ihmc.idl.generated.ultrainnerClusterType src, us.ihmc.idl.generated.ultrainnerClusterType dest)
   {
      dest.set(src);
   }
   
   
   @Override
   public us.ihmc.idl.generated.ultrainnerClusterType createData()
   {
      return new us.ihmc.idl.generated.ultrainnerClusterType();
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
   
   public void serialize(us.ihmc.idl.generated.ultrainnerClusterType data, CDR cdr)
	{
		write(data, cdr);
	}

   public void deserialize(us.ihmc.idl.generated.ultrainnerClusterType data, CDR cdr)
   {
        read(data, cdr);
   }
   
   public void copy(us.ihmc.idl.generated.ultrainnerClusterType src, us.ihmc.idl.generated.ultrainnerClusterType dest)
   {
      staticCopy(src, dest);
   }	

   
   @Override
   public ultrainnerClusterTypePubSubType newInstance()
   {
   	  return new ultrainnerClusterTypePubSubType();
   }
}