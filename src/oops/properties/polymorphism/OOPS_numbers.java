package oops.properties.polymorphism;

public class OOPS_numbers {

    int sum(int a , int b){
        return a + b;
    }


    int sum(int a, int b, int c){
        return a + b;
    }

    public static void main(String[] args) {
        OOPS_numbers num =new OOPS_numbers();
        num.sum(2,3);
        num.sum(1,2,6);
//        num.sum(4,5,2,9);

    }
}
