package us.ihmc.idl.generated;

import java.io.IOException;

import us.ihmc.pubsub.TopicDataType;
import us.ihmc.pubsub.common.SerializedPayload;
import us.ihmc.idl.InterchangeSerializer;
import us.ihmc.idl.CDR;
import us.ihmc.idl.IDLSequence;

/**
* 
* Topic data type of the struct "innerclusterType" defined in "DDS_Cluster.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DDS_Cluster.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DDS_Cluster.idl instead.
*
*/
public class innerclusterTypePubSubType implements TopicDataType<us.ihmc.idl.generated.innerclusterType>
{
	public static final String name = "innerclusterType";
	
	
	
    public innerclusterTypePubSubType()
    {
        
    }

	private final CDR serializeCDR = new CDR();
	private final CDR deserializeCDR = new CDR();

    
    @Override
   public void serialize(us.ihmc.idl.generated.innerclusterType data, SerializedPayload serializedPayload) throws IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }
   @Override
   public void deserialize(SerializedPayload serializedPayload, us.ihmc.idl.generated.innerclusterType data) throws IOException
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

	    current_alignment += 1 + CDR.alignment(current_alignment, 1);

	    current_alignment += us.ihmc.idl.generated.superinnerClusterTypePubSubType.getMaxCdrSerializedSize(current_alignment);
	
	    return current_alignment - initial_alignment;
	}


	public final static int getCdrSerializedSize(us.ihmc.idl.generated.innerclusterType data)
	{
		return getCdrSerializedSize(data, 0);
	}

	public final static int getCdrSerializedSize(us.ihmc.idl.generated.innerclusterType data, int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += 4 + CDR.alignment(current_alignment, 4);

	    current_alignment += 1 + CDR.alignment(current_alignment, 1);

	    current_alignment += us.ihmc.idl.generated.superinnerClusterTypePubSubType.getCdrSerializedSize(data.getSuperinnerCluster(), current_alignment);
	
	    return current_alignment - initial_alignment;
	}
	
   public static void write(us.ihmc.idl.generated.innerclusterType data, CDR cdr)
   {

	    cdr.write_type_5(data.getSgl_Num());

	    cdr.write_type_7(data.getBoolean());

	    us.ihmc.idl.generated.superinnerClusterTypePubSubType.write(data.getSuperinnerCluster(), cdr);
   }

   public static void read(us.ihmc.idl.generated.innerclusterType data, CDR cdr)
   {

	    	data.setSgl_Num(cdr.read_type_5());
	    	

	    	data.setBoolean(cdr.read_type_7());
	    	

	    	us.ihmc.idl.generated.superinnerClusterTypePubSubType.read(data.getSuperinnerCluster(), cdr);	
   }
   
	@Override
	public final void serialize(us.ihmc.idl.generated.innerclusterType data, InterchangeSerializer ser)
	{
			    ser.write_type_5("Sgl_Num", data.getSgl_Num());
			    
			    ser.write_type_7("Boolean", data.getBoolean());
			    
			    ser.write_type_a("superinnerCluster", new us.ihmc.idl.generated.superinnerClusterTypePubSubType(), data.getSuperinnerCluster());

			    
	}
	
	@Override
	public final void deserialize(InterchangeSerializer ser, us.ihmc.idl.generated.innerclusterType data)
	{
	    			data.setSgl_Num(ser.read_type_5("Sgl_Num"));	
	    	    
	    			data.setBoolean(ser.read_type_7("Boolean"));	
	    	    
	    			ser.read_type_a("superinnerCluster", new us.ihmc.idl.generated.superinnerClusterTypePubSubType(), data.getSuperinnerCluster());
	    	
	    	    
	}

   public static void staticCopy(us.ihmc.idl.generated.innerclusterType src, us.ihmc.idl.generated.innerclusterType dest)
   {
      dest.set(src);
   }
   
   
   @Override
   public us.ihmc.idl.generated.innerclusterType createData()
   {
      return new us.ihmc.idl.generated.innerclusterType();
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
   
   public void serialize(us.ihmc.idl.generated.innerclusterType data, CDR cdr)
	{
		write(data, cdr);
	}

   public void deserialize(us.ihmc.idl.generated.innerclusterType data, CDR cdr)
   {
        read(data, cdr);
   }
   
   public void copy(us.ihmc.idl.generated.innerclusterType src, us.ihmc.idl.generated.innerclusterType dest)
   {
      staticCopy(src, dest);
   }	

   
   @Override
   public innerclusterTypePubSubType newInstance()
   {
   	  return new innerclusterTypePubSubType();
   }
}