package Loops;

public class Practice2 {
    public static void main(String[] args) {
        /*
        print out I am here today
        for the ages from 23 to 26
        before 23 after 26 print ---> I am not here
         */

        int age = 23;

        while (age <= 26) {

            System.out.println("I am  here");
            age++;
        }
        System.out.println("I am not here");

        // print out between 10-20

        int number = 10;

        while (number < 21) {

            System.out.println(" you live with your parent " + number++);


        }
        System.out.println(" you're grown up " );
    }
}
