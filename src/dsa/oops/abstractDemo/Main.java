package dsa.oops.abstractDemo;

public class Main {

    public static void main(String[] args) {
        Child child = new Child(1);
        child.career("doctor");

        ChildOne childOne = new ChildOne(2);
        childOne.career("teacher");

        //Parent.greet();

        //you cannot create object of parent class
        //Parent parent = new Parent(23) ;
    }

}
