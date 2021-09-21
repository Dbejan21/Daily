package Object;

import Methods.MathPrc;

import java.awt.event.WindowFocusListener;

public class AnimalTestClass {
    public static void main(String[] args) {

        Animal cat = new Animal();

//        cat.name = "Tom";
        System.out.println(cat.name);
        cat.name = "Tom";
        cat.age = 5;
        cat.weight = 8.5;
        cat.legNumber = 4;

        System.out.println(cat.age);
        System.out.println(cat.weight);
        System.out.println(cat.legNumber);

        // create a dog object and

        Animal dog = new Animal();
        dog.name = "Rex";
        dog.weight = 6;
        dog.legNumber = 4;
        dog.age = 3;
        System.out.println(dog.name);
        System.out.println(dog.weight);
        System.out.println(dog.age);
        System.out.println(dog.legNumber);

        Animal bird = new Animal();

        cat.run("up");

        cat.sleep();
        dog.sleep();
        bird.sleep();


        bird.info();
        cat.info();
        cat.energy = 100;
        cat.run("west");
        cat.run("south");
        cat.run("downstairs");
        cat.info();
        cat.sleep();
        cat.info();

        bird.energy = 100;
        bird.sleep();
        bird.run("in to the cage");

        MathPrc obj1 = new MathPrc();
        obj1.sum(1, 1);

        Animal cow = new Animal();
        cow.name = "Moo";
        cow.weight = 50;
        cow.legNumber = 4;
        cow.energy = 100;

        cow.info();

    }
}
