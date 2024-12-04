package oops.properties.inheritance;

public class OOPS_box {
    double l;
    double h;
    double w;

    OOPS_box(){
        this.h =-1;
        this.l = -1;
        this.w =-1;

    }

    //cube
    OOPS_box(double side){
        this.w= side;
        this.l= side;
        this.h= side;

    }
    OOPS_box(double l,double h,double w){
        this.w= w;
        this.l= l;
        this.h= h;

    }

    OOPS_box(OOPS_box old){
        this.h =old.h;
        this.w =old.w;
        this.l =old.l;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
