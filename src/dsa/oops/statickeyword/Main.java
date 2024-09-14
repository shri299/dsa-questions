package dsa.oops.statickeyword;

public class Main {

    public static void main(String[] args) {
        Human girl = new Human(23,"srishti",10000,false);
        Human boy = new Human(23,"idiot",20000,true);
        System.out.println(Human.population);
        System.out.println(Human.population);

        //greeting(); //you cannot use this because it depends on instance,
        // but the function you are using it in depends on instance

        //to make this work:
        //you need to reference their(non-static) instance in a static function
        Main obj = new Main();
        obj.greeting();

    }

    //non-static so belong to an object
    void greeting(){
        System.out.println("greetings!");
    }
}
