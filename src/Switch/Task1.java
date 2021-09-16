package Switch;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
        ask user to provide a number between 1 to 7
        print the matching name of the day for that number
        when user enters 1 => "it is Monday"

         */

        Scanner number = new Scanner(System.in);

        System.out.println("Enter a number between 1-7 ");
        int output = number.nextInt();

        switch (output) {
            default:
                System.out.println("Not matching");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
            case 7 :
                System.out.println("Sunday");
                break;
        }
    }
}