package dsa.oops.abstractDemo;

public class Child extends Parent{ //every child class has to override all the abstract method in parent class

    public Child(int age) {
        super(age);
    }


    @Override
    void career(String name) {
        System.out.println(name);
    }
}
