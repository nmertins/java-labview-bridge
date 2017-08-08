package us.ihmc.idl.generated;
import us.ihmc.idl.IDLSequence;
import java.util.Arrays;

/**
* 
* Definition of the class "superinnerClusterType" defined in DDS_Cluster.idl. 
*
* This file was automatically generated from DDS_Cluster.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DDS_Cluster.idl instead.
*
*/
public class superinnerClusterType
{
    public superinnerClusterType()
    {
        	ultrainnerCluster_ = new us.ihmc.idl.generated.ultrainnerClusterType();        
        
    }

    public void set(superinnerClusterType other)
    {
        	Dbl_Num_ = other.Dbl_Num_;
           	us.ihmc.idl.generated.ultrainnerClusterTypePubSubType.staticCopy(other.ultrainnerCluster_, ultrainnerCluster_);
    }

    public void setDbl_Num(double Dbl_Num)
    {
        Dbl_Num_ = Dbl_Num;
    }

    public double getDbl_Num()
    {
        return Dbl_Num_;
    }

        

    public us.ihmc.idl.generated.ultrainnerClusterType getUltrainnerCluster()
    {
        return ultrainnerCluster_;
    }

        




    @Override
    public boolean equals(Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof superinnerClusterType)) return false;
        superinnerClusterType otherMyClass = (superinnerClusterType)other;
        boolean returnedValue = true;

        returnedValue &= this.Dbl_Num_ == otherMyClass.Dbl_Num_;

                
        returnedValue &= this.ultrainnerCluster_.equals(otherMyClass.ultrainnerCluster_);
                

        return returnedValue;
    }
    
     @Override
    public String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("superinnerClusterType {");
        builder.append("Dbl_Num=");
        builder.append(this.Dbl_Num_);

                builder.append(", ");
        builder.append("ultrainnerCluster=");
        builder.append(this.ultrainnerCluster_);

                
        builder.append("}");
		return builder.toString();
    }

    private double Dbl_Num_; 
    private us.ihmc.idl.generated.ultrainnerClusterType ultrainnerCluster_; 

}