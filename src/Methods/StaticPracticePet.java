package Methods;

public class StaticPracticePet {
    String name;
    int age;
    String color;
static int foodAmount=20;


public void eat(){
    foodAmount -=1;
    System.out.println("leftover food is : " +foodAmount);
}

public static void run(){
    //static int a=23; local variables cannot be static
    System.out.println("cat is running");
}
    public static void main(String[] args) {
        StaticPracticePet cat = new StaticPracticePet();
        cat.name ="Felix";
        cat.age = 3;
        cat.color="white";

        cat.eat();
        cat.run();
        run();
        StaticPracticePet.run();


        StaticPracticePet cat1 = new StaticPracticePet();
        cat1.name= "Moorzik";
        cat1.age= 4;
        cat1.color= "black";
        cat1.eat();

    }

}
