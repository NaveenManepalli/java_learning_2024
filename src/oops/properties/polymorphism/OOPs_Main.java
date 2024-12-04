package oops.properties.polymorphism;

public class OOPs_Main {
    public static void main(String[] args) {
        OOPS_Shapes shape = new OOPS_Shapes();
        OOPS_Circle circle = new OOPS_Circle();
        OOPS_Square square = new OOPS_Square();

        shape.area();
    }
}
