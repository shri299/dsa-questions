package dsa.oops.abstractDemo;

public class ChildOne extends Parent{
    public ChildOne(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println(name);
    }
}
