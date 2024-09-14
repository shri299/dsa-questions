package dsa.oops;


//a class for which you can create only one object
public class SingletonClass {

    private SingletonClass (){

    }

    private static SingletonClass singletonClass = new SingletonClass();

    public static SingletonClass getInstance(){
        return singletonClass;
    }
}
