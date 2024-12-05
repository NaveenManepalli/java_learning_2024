package oops.access;

public class OOPS_ObjectDemo {

    int num;
    float gpa;

    public OOPS_ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // already covered these 2
    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }


    // we will go in details of how to create it in hashmap lecture
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((OOPS_ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        OOPS_ObjectDemo obj1 = new OOPS_ObjectDemo(12, 56.8f);
        OOPS_ObjectDemo obj2 = new OOPS_ObjectDemo(12, 78.9f);

        if (obj1 == obj2) {
            System.out.println("obj1 is equal to obj2");
        }

        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass().getName());

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }

}

