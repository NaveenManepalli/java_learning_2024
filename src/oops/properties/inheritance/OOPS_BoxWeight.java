package oops.properties.inheritance;

import java.util.ArrayList;

public class OOPS_BoxWeight extends OOPS_box{
    double Weight;

    public OOPS_BoxWeight(){
        this.Weight=-1;
    }
    //    @Override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }

    OOPS_BoxWeight (OOPS_BoxWeight other) {
        super(other);
        Weight = other.Weight;
    }

    OOPS_BoxWeight(double side, double weight) {
        super(side);
        this.Weight = weight;
    }

    public OOPS_BoxWeight(double l, double h, double w, double weight){
        super(l,h,w);
        this.Weight = weight;
    }
}
