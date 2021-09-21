package IfStatement;

public class Practice2 {

    public static void main(String[] args) {
        int age =12;
        int money = 200;

        if (age >=18){

            System.out.println("you can go to Picnic");
        }

        if (money >=100) {

            System.out.println(" you can go with this money: " +money);
        }

        // combine these two condition to create an if statement wich will accept either of conditions age
        // print "you are OK with one of the requirment"

        if(age >=18 || money >= 100) {
            System.out.println("you are Ok with....");


        }
    }
}
