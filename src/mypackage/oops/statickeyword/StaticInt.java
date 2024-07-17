package mypackage.oops.statickeyword;


//initialisation of static variables
public class StaticInt {

    static int a;
    static int b;

    //runs when the class is loaded for the first time
    static {
        System.out.println("i am in static block");
        b = 5;
        a = b * 5;
    }

    public static void main(String[] args) {
        System.out.println(StaticInt.a + " "+ StaticInt.b);
    }
}
