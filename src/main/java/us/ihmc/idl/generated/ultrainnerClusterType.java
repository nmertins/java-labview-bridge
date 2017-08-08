package us.ihmc.idl.generated;
import us.ihmc.idl.IDLSequence;
import java.util.Arrays;

/**
* 
* Definition of the class "ultrainnerClusterType" defined in DDS_Cluster.idl. 
*
* This file was automatically generated from DDS_Cluster.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DDS_Cluster.idl instead.
*
*/
public class ultrainnerClusterType
{
    public ultrainnerClusterType()
    {
        	I16_Array_ = new IDLSequence.Short (2, "type_1");
        
        
    }

    public void set(ultrainnerClusterType other)
    {
            I16_Array_.set(other.I16_Array_);	
    }


    public IDLSequence.Short  getI16_Array()
    {
        return I16_Array_;
    }

        




    @Override
    public boolean equals(Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof ultrainnerClusterType)) return false;
        ultrainnerClusterType otherMyClass = (ultrainnerClusterType)other;
        boolean returnedValue = true;

        returnedValue &= this.I16_Array_.equals(otherMyClass.I16_Array_);
                

        return returnedValue;
    }
    
     @Override
    public String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("ultrainnerClusterType {");
        builder.append("I16_Array=");
        builder.append(this.I16_Array_);

                
        builder.append("}");
		return builder.toString();
    }

    private IDLSequence.Short  I16_Array_; 

}