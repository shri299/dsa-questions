package mypackage.oops.inheritance;

public class Main {

    public static void main(String[] args) {
//        Base base = new Base();
//        System.out.println(base.length + " "+base.height+" "+ base.width);

        Child child = new Child();
        System.out.println(child.length + " "+child.height+" "+ child.width+" "+ child.weight);

        Base base = new Child(1,2,3,4);
        //System.out.println(base.weight); -> still cannot access the child variables

        //here everything is fine, but how will the base class initialise the value if weights
        //Child child1 = new Base(1,2,3);
    }
}
