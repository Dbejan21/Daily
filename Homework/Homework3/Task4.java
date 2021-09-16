package Homework3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)

    {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = myScan.next().toLowerCase();
        //int letters = text.length();
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            System.out.println(str.substring(2, str.length() - 0));
        } else {
            System.out.println(str);
        }
    }
}
