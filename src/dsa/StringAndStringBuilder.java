package dsa;

public class StringAndStringBuilder {

    public static void main(String[] args) {
        String name = "Srishti";
        String nameNew = "Srishti";
        String a = new String("Srishti");
        String b = new String("Srishti");
        System.out.println(name);
        System.out.println(name==nameNew);
        System.out.println(a==b);
        System.out.println(a==nameNew);
        System.out.println(a.equals(b));
        System.out.println(a.equals(nameNew));
    }
}
