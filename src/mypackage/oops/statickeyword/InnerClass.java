package mypackage.oops.statickeyword;

//outside classes can never be static
public class InnerClass {

    //inner classes can be static
    class Testing {
        String name;

        Testing(String name){
            this.name=name;
        }
    }

    //independent of the outer class object
    static class Testing2 {
        String name;

        Testing2(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        //Testing testing = new Testing("srishti"); cannot use it here, cuz if the inner class is non-static,
        // it will need the reference

        //since it is an outer class, instantiating it inside a static component will cause any issues
        Test test = new Test("idiot");

        Testing2 testing2 = new Testing2("some name");
    }
}

class Test {
    String name;

    Test(String name){
        this.name=name;
    }
}
