package dsa.oops.inheritance;

public class Base {

    double height;
    double length;
    double width;

    Base (){
        //super();
        this.height=-1;
        this.length=-1;
        this.width=-1;
    }

    Base (double h, double l, double w){
        this.height=h;
        this.length=l;
        this.width=w;
    }

    Base (double side){
        this.height=side;
        this.length=side;
        this.width=side;
    }

    Base (Base base){
        this.height= base.height;
        this.length= base.length;
        this.width= base.width;
    }

    public void displayInfo(){
        System.out.println("running the base class");
    }
}
