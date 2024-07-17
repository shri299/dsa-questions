package mypackage.oops.statickeyword;

public class Human {

    int age;
    String name;
    int salary;

    static long population;

    static void message(String name){
        //System.out.println("the name is "+this.name); //you cannot use this inside static content, for obvious reasons
        System.out.println("my name");
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population = population + 1; //this.population will also work here
    }

    boolean married;
}
