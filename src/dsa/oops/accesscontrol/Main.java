package dsa.oops.accesscontrol;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //data hiding
        //private - only in that file
        //public - anywhere
        //default/no modifier - only in same package
        //protected -

        A a = new A(2,"Srishti");
        System.out.println(a.getNum());

    }

    public void deserialize(String data) {
        List<String> list = List.of(data.split(","));
        Collections.reverse(list);
    }
}
