package Object;

public class Animal {
    String name = "Jerry";
    int age;
    double weight;
    int legNumber;
    double energy;


    public void run(String destination) {
        energy -= 10;
        System.out.println(name + " is running " + destination);

        // create  sleep method


    }

    public void sleep() {
        energy = 100;
        System.out.println(name + " is sleeping");

    }

    // create print info method to print out about animal
    public void info() {

        System.out.println("name is " + name + " age is " + age + "weight is " + weight + "energy level is " + energy);







    }



    }


