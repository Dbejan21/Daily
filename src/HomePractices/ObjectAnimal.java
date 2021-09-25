package HomePractices;

public class ObjectAnimal {

    String name = "Jerry";
    int age;
    double weight;
    int legNumber;
    double energy;

    public void run(String direction) {
        energy -= 10;
        System.out.println(name + " is running " + direction);

    }

    public void sleep(int hours) {

        System.out.println(name + "is sleeping " +hours +" hours" );
    }

    public void info() {

        System.out.println("name is " + name + " age is " + age + "weight is " + weight + "energy level is " + energy);


    }
}
