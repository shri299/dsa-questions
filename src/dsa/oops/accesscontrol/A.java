package dsa.oops.accesscontrol;

public class A {

    private int num; //this is data hiding, access this using getters and setters
    String name;
    int[] arr;

    public A (int num, String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }

    public void setNum(int num){
        this.num=num;
    }

    public int getNum(){
        return this.num;
    }
}
