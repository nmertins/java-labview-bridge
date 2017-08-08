package us.ihmc.idl.generated;
import us.ihmc.idl.IDLSequence;
import java.util.Arrays;

/**
* 
* Definition of the class "ComplexType" defined in DDS_Cluster.idl. 
*
* This file was automatically generated from DDS_Cluster.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DDS_Cluster.idl instead.
*
*/
public class ComplexType
{
    public ComplexType()
    {
        	Text_ = new StringBuilder(255); 
        	Sgl_Array_ = new IDLSequence.Float (4, "type_5");
        	innercluster_ = new us.ihmc.idl.generated.innerclusterType();        
        
    }

    public void set(ComplexType other)
    {
        	Text_.setLength(0);
        	Text_.append(other.Text_);
        	I32_Num_ = other.I32_Num_;
        	I64_Num_ = other.I64_Num_;
        	U16_Num_ = other.U16_Num_;
            Sgl_Array_.set(other.Sgl_Array_);	us.ihmc.idl.generated.innerclusterTypePubSubType.staticCopy(other.innercluster_, innercluster_);
    }

        public void setText(String Text)
        {
        	Text_.setLength(0);
        	Text_.append(Text);
        }
        
        public String getTextAsString()
        {
        	return getText().toString();
        }

    public StringBuilder getText()
    {
        return Text_;
    }

        
    public void setI32_Num(int I32_Num)
    {
        I32_Num_ = I32_Num;
    }

    public int getI32_Num()
    {
        return I32_Num_;
    }

        
    public void setI64_Num(long I64_Num)
    {
        I64_Num_ = I64_Num;
    }

    public long getI64_Num()
    {
        return I64_Num_;
    }

        
    public void setU16_Num(int U16_Num)
    {
        U16_Num_ = U16_Num;
    }

    public int getU16_Num()
    {
        return U16_Num_;
    }

        

    public IDLSequence.Float  getSgl_Array()
    {
        return Sgl_Array_;
    }

        

    public us.ihmc.idl.generated.innerclusterType getInnercluster()
    {
        return innercluster_;
    }

        




    @Override
    public boolean equals(Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof ComplexType)) return false;
        ComplexType otherMyClass = (ComplexType)other;
        boolean returnedValue = true;

        returnedValue &= us.ihmc.idl.IDLTools.equals(this.Text_, otherMyClass.Text_);
                
        returnedValue &= this.I32_Num_ == otherMyClass.I32_Num_;

                
        returnedValue &= this.I64_Num_ == otherMyClass.I64_Num_;

                
        returnedValue &= this.U16_Num_ == otherMyClass.U16_Num_;

                
        returnedValue &= this.Sgl_Array_.equals(otherMyClass.Sgl_Array_);
                
        returnedValue &= this.innercluster_.equals(otherMyClass.innercluster_);
                

        return returnedValue;
    }
    
     @Override
    public String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("ComplexType {");
        builder.append("Text=");
        builder.append(this.Text_);

                builder.append(", ");
        builder.append("I32_Num=");
        builder.append(this.I32_Num_);

                builder.append(", ");
        builder.append("I64_Num=");
        builder.append(this.I64_Num_);

                builder.append(", ");
        builder.append("U16_Num=");
        builder.append(this.U16_Num_);

                builder.append(", ");
        builder.append("Sgl_Array=");
        builder.append(this.Sgl_Array_);

                builder.append(", ");
        builder.append("innercluster=");
        builder.append(this.innercluster_);

                
        builder.append("}");
		return builder.toString();
    }

    private StringBuilder Text_; 
    private int I32_Num_; 
    private long I64_Num_; 
    private int U16_Num_; 
    private IDLSequence.Float  Sgl_Array_; 
    private us.ihmc.idl.generated.innerclusterType innercluster_; 

}