package oops.access;

public class OOPS_SubClass extends OOPS_a {

    public OOPS_SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        OOPS_SubClass obj = new OOPS_SubClass(45, "Kunal Kushwaha");
        int n = obj.num;

        System.out.println(obj instanceof Object);
    }
}



