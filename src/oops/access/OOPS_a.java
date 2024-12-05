package oops.access;

public class OOPS_a {
    int num ; //constructor
    String name;
    int[] array;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public OOPS_a(int num, String name){

        this.num = num ;
        this.name = name;
        this.array =new int[num];
    }


}
