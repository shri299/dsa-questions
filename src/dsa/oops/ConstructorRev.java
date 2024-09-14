package dsa.oops;

public class ConstructorRev {

    public static void main(String[] args) {
        Student student = new Student(12,12.2f,"srishti");
        System.out.println(student.age);
        System.out.println(student.marks);
        System.out.println(student.name);
    }
}

class Student{
    String name;
    int age;
    float marks;

    Student(int age, float marks, String name){
        this.age=age;
        this.marks=marks;
        this.name=name;
    }

    Student(){
        this.age=1;
        this.marks=13.4f;
        this.name="something";
    }
}
