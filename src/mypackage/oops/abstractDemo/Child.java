package mypackage.oops.abstractDemo;

public class Child extends Parent{

    public Child(int age) {
        super(age);
    }


    @Override
    void career(String name) {
        System.out.println(name);
    }
}
