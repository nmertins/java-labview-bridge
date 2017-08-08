package us.ihmc.idl.generated;

import java.io.IOException;

import us.ihmc.pubsub.TopicDataType;
import us.ihmc.pubsub.common.SerializedPayload;
import us.ihmc.idl.InterchangeSerializer;
import us.ihmc.idl.CDR;
import us.ihmc.idl.IDLSequence;

/**
* 
* Topic data type of the struct "ComplexType" defined in "DDS_Cluster.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DDS_Cluster.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DDS_Cluster.idl instead.
*
*/
public class ComplexTypePubSubType implements TopicDataType<us.ihmc.idl.generated.ComplexType>
{
	public static final String name = "ComplexType";
	
	
	
    public ComplexTypePubSubType()
    {
        
    }

	private final CDR serializeCDR = new CDR();
	private final CDR deserializeCDR = new CDR();

    
    @Override
   public void serialize(us.ihmc.idl.generated.ComplexType data, SerializedPayload serializedPayload) throws IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }
   @Override
   public void deserialize(SerializedPayload serializedPayload, us.ihmc.idl.generated.ComplexType data) throws IOException
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
	            
	    current_alignment += 4 + CDR.alignment(current_alignment, 4) + 255 + 1;

	    current_alignment += 4 + CDR.alignment(current_alignment, 4);

	    current_alignment += 8 + CDR.alignment(current_alignment, 8);

	    current_alignment += 2 + CDR.alignment(current_alignment, 2);

	    current_alignment += 4 + CDR.alignment(current_alignment, 4);
	    current_alignment += (4 * 4) + CDR.alignment(current_alignment, 4);


	    current_alignment += us.ihmc.idl.generated.innerclusterTypePubSubType.getMaxCdrSerializedSize(current_alignment);
	
	    return current_alignment - initial_alignment;
	}


	public final static int getCdrSerializedSize(us.ihmc.idl.generated.ComplexType data)
	{
		return getCdrSerializedSize(data, 0);
	}

	public final static int getCdrSerializedSize(us.ihmc.idl.generated.ComplexType data, int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += 4 + CDR.alignment(current_alignment, 4) + data.getText().length() + 1;

	    current_alignment += 4 + CDR.alignment(current_alignment, 4);

	    current_alignment += 8 + CDR.alignment(current_alignment, 8);

	    current_alignment += 2 + CDR.alignment(current_alignment, 2);

	    current_alignment += 4 + CDR.alignment(current_alignment, 4);
	    current_alignment += (data.getSgl_Array().size() * 4) + CDR.alignment(current_alignment, 4);


	    current_alignment += us.ihmc.idl.generated.innerclusterTypePubSubType.getCdrSerializedSize(data.getInnercluster(), current_alignment);
	
	    return current_alignment - initial_alignment;
	}
	
   public static void write(us.ihmc.idl.generated.ComplexType data, CDR cdr)
   {

	    if(data.getText().length() <= 255)
	    cdr.write_type_d(data.getText());else
	        throw new RuntimeException("Text field exceeds the maximum length");

	    cdr.write_type_2(data.getI32_Num());

	    cdr.write_type_11(data.getI64_Num());

	    cdr.write_type_3(data.getU16_Num());

	    if(data.getSgl_Array().size() <= 4)
	    cdr.write_type_e(data.getSgl_Array());else
	        throw new RuntimeException("Sgl_Array field exceeds the maximum length");

	    us.ihmc.idl.generated.innerclusterTypePubSubType.write(data.getInnercluster(), cdr);
   }

   public static void read(us.ihmc.idl.generated.ComplexType data, CDR cdr)
   {

	    	cdr.read_type_d(data.getText());	

	    	data.setI32_Num(cdr.read_type_2());
	    	

	    	data.setI64_Num(cdr.read_type_11());
	    	

	    	data.setU16_Num(cdr.read_type_3());
	    	

	    	cdr.read_type_e(data.getSgl_Array());	

	    	us.ihmc.idl.generated.innerclusterTypePubSubType.read(data.getInnercluster(), cdr);	
   }
   
	@Override
	public final void serialize(us.ihmc.idl.generated.ComplexType data, InterchangeSerializer ser)
	{
			    ser.write_type_d("Text", data.getText());
			    
			    ser.write_type_2("I32_Num", data.getI32_Num());
			    
			    ser.write_type_11("I64_Num", data.getI64_Num());
			    
			    ser.write_type_3("U16_Num", data.getU16_Num());
			    
			    ser.write_type_e("Sgl_Array", data.getSgl_Array());
			    
			    ser.write_type_a("innercluster", new us.ihmc.idl.generated.innerclusterTypePubSubType(), data.getInnercluster());

			    
	}
	
	@Override
	public final void deserialize(InterchangeSerializer ser, us.ihmc.idl.generated.ComplexType data)
	{
	    			ser.read_type_d("Text", data.getText());	
	    	    
	    			data.setI32_Num(ser.read_type_2("I32_Num"));	
	    	    
	    			data.setI64_Num(ser.read_type_11("I64_Num"));	
	    	    
	    			data.setU16_Num(ser.read_type_3("U16_Num"));	
	    	    
	    			ser.read_type_e("Sgl_Array", data.getSgl_Array());	
	    	    
	    			ser.read_type_a("innercluster", new us.ihmc.idl.generated.innerclusterTypePubSubType(), data.getInnercluster());
	    	
	    	    
	}

   public static void staticCopy(us.ihmc.idl.generated.ComplexType src, us.ihmc.idl.generated.ComplexType dest)
   {
      dest.set(src);
   }
   
   
   @Override
   public us.ihmc.idl.generated.ComplexType createData()
   {
      return new us.ihmc.idl.generated.ComplexType();
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
   
   public void serialize(us.ihmc.idl.generated.ComplexType data, CDR cdr)
	{
		write(data, cdr);
	}

   public void deserialize(us.ihmc.idl.generated.ComplexType data, CDR cdr)
   {
        read(data, cdr);
   }
   
   public void copy(us.ihmc.idl.generated.ComplexType src, us.ihmc.idl.generated.ComplexType dest)
   {
      staticCopy(src, dest);
   }	

   
   @Override
   public ComplexTypePubSubType newInstance()
   {
   	  return new ComplexTypePubSubType();
   }
}