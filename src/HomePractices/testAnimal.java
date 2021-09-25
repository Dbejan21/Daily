package HomePractices;

public class testAnimal {

    public static void main(String[] args) {
        ObjectAnimal cat = new ObjectAnimal();
        cat.name ="Tom";
        cat.age =5;
        cat.weight = 5;
        cat.legNumber=4;

        System.out.println(cat.age);
        System.out.println(cat.name);
        System.out.println(cat.weight);
        System.out.println(cat.legNumber);

        ObjectAnimal dog = new ObjectAnimal();

        dog.name= "rex";
        dog.age = 8;
        dog.weight=10.2;
        dog.legNumber =4;

        ObjectAnimal bird = new ObjectAnimal();

        cat.run("west");
        dog.run("Up");
        bird.run("downstairs");

        cat.sleep(3);
        dog.sleep(2);
        bird.sleep(1);
dog.info();
    }

}
