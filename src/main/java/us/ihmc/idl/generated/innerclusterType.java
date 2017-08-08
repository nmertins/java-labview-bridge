package us.ihmc.idl.generated;
import us.ihmc.idl.IDLSequence;
import java.util.Arrays;

/**
* 
* Definition of the class "innerclusterType" defined in DDS_Cluster.idl. 
*
* This file was automatically generated from DDS_Cluster.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DDS_Cluster.idl instead.
*
*/
public class innerclusterType
{
    public innerclusterType()
    {
        	superinnerCluster_ = new us.ihmc.idl.generated.superinnerClusterType();        
        
    }

    public void set(innerclusterType other)
    {
        	Sgl_Num_ = other.Sgl_Num_;
        	Boolean_ = other.Boolean_;
           	us.ihmc.idl.generated.superinnerClusterTypePubSubType.staticCopy(other.superinnerCluster_, superinnerCluster_);
    }

    public void setSgl_Num(float Sgl_Num)
    {
        Sgl_Num_ = Sgl_Num;
    }

    public float getSgl_Num()
    {
        return Sgl_Num_;
    }

        
    public void setBoolean(boolean Boolean)
    {
        Boolean_ = Boolean;
    }

    public boolean getBoolean()
    {
        return Boolean_;
    }

        

    public us.ihmc.idl.generated.superinnerClusterType getSuperinnerCluster()
    {
        return superinnerCluster_;
    }

        




    @Override
    public boolean equals(Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof innerclusterType)) return false;
        innerclusterType otherMyClass = (innerclusterType)other;
        boolean returnedValue = true;

        returnedValue &= this.Sgl_Num_ == otherMyClass.Sgl_Num_;

                
        returnedValue &= this.Boolean_ == otherMyClass.Boolean_;

                
        returnedValue &= this.superinnerCluster_.equals(otherMyClass.superinnerCluster_);
                

        return returnedValue;
    }
    
     @Override
    public String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("innerclusterType {");
        builder.append("Sgl_Num=");
        builder.append(this.Sgl_Num_);

                builder.append(", ");
        builder.append("Boolean=");
        builder.append(this.Boolean_);

                builder.append(", ");
        builder.append("superinnerCluster=");
        builder.append(this.superinnerCluster_);

                
        builder.append("}");
		return builder.toString();
    }

    private float Sgl_Num_; 
    private boolean Boolean_; 
    private us.ihmc.idl.generated.superinnerClusterType superinnerCluster_; 

}