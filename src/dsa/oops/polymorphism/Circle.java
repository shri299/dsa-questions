package dsa.oops.polymorphism;

public class Circle extends Shapes{

    @Override //a simple check annotation, to make sure that the function is overridden
    void area(){
        System.out.println("I am in circle");
    }
}
