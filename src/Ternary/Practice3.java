package Ternary;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask user for their lasname
        if the last name starts with 'A' to 'K'
        concat the last name with " most popular last name
        otherwise ;
        concat the last name with : "well known last name"
        sout result

         */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your last name? ");
        String answer = input.nextLine().toUpperCase();

        String result = answer.charAt(0)>='A'&& answer.charAt(0)<='K' ?  answer + " most popular last name" : answer + " well known last name";
        System.out.println(result);

        // if we want show first letter to show

        char result2 = answer.charAt(0)>='A'&& answer.charAt(0)<='K' ?  answer.charAt(0) : answer.charAt(0);
        System.out.println(result2);
    }
}
