package us.ihmc.idl.generated;
import us.ihmc.idl.IDLSequence;
import java.util.Arrays;

/**
* 
* Definition of the class "DDS_Double" defined in DDS_Double.idl. 
*
* This file was automatically generated from DDS_Double.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DDS_Double.idl instead.
*
*/
public class DDS_Double
{
    public DDS_Double()
    {
        
        
    }

    public void set(DDS_Double other)
    {
        	value_ = other.value_;

    }

    public void setValue(double value)
    {
        value_ = value;
    }

    public double getValue()
    {
        return value_;
    }

        




    @Override
    public boolean equals(Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof DDS_Double)) return false;
        DDS_Double otherMyClass = (DDS_Double)other;
        boolean returnedValue = true;

        returnedValue &= this.value_ == otherMyClass.value_;

                

        return returnedValue;
    }
    
     @Override
    public String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("DDS_Double {");
        builder.append("value=");
        builder.append(this.value_);

                
        builder.append("}");
		return builder.toString();
    }

    private double value_; 

}