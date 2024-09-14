package dsa.oops.inheritance;

public class Child extends Base{
    double weight;

    Child (){
        this.weight=-1;
    }

    Child (double h, double l, double w, double weight){
        super(h,l,w); //calls the parent class constructor and initialises the values in it
        this.weight=weight;
    }

    Child (Child child){
        super(child);
        this.weight=child.weight;
    }


}
