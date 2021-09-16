package Homework3;

import java.util.Locale;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
        Using scanner ask user to enter any String value. If this String
        has the color like red or blue with lower case print the red or blue.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = input.nextLine().toLowerCase();
//
//
        if (str.contains("r") && str.contains("e") && str.contains("d")) {

            System.out.println("red");

        } else if (str.contains("b") && str.contains("l") && str.contains("u")&& str.contains("e"))
        {
            System.out.println("blue");


        } else {
            System.out.println(str);
        }

    }
}


