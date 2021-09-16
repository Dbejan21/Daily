package Switch;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        /*
        ask user to provide his favorite color
        if it is blue --> print --> "My favorite color is blue, too"
if it is red --> print --> "I also like color red"
if it is green --> print --> "Green is more natural"
if it is pink --> print --> "Most women like pink"
if it is none of those --> print --> "There is no matching color"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("provide your favorite color");
        String color = input.nextLine();

        switch (color.toLowerCase()){

            case "blue" :
                System.out.println("My favorite color is blue, too");
                break;
            case "red" :
                System.out.println("I also like color red");
                break;
            case "green":
                System.out.println("Green is more natural");
                break;
            case "pink":
                System.out.println("Most women like pink");
                break;
            default:
                System.out.println("no matching color");

        }

    }
}
