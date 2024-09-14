package dsa.oops.abstractDemo;

public abstract class Parent { //if a class contains an abstract method, that class should also be abstract

    int age; //can have normal variables, constructor

    public Parent (int age){
        this.age=age;
    }

    abstract void career(String name);


    //there is no point in having normal method in abstract class, cuz you cannot create an obj of this class
//    public void greet(){
//        System.out.println("hello world");
//    }

    //as static method would work in this class
//    public static void greet(){
//        System.out.println("hello world");
//    }

    //no abstract constructor
    //no abstract static method
}
