package oops.properties.inheritance;

public class OOPS_BoxPrice extends OOPS_BoxWeight{

    double cost;

    OOPS_BoxPrice(){
        super();
        this.cost =-1;
    }

    OOPS_BoxPrice(OOPS_BoxPrice old){
        super(old);
        this.cost = old.cost;
    }

    public OOPS_BoxPrice(double l, double h, double w, double weight, double cost){
        super(l,h,w,weight);
        this.cost =cost;
    }



}
