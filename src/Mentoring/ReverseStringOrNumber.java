package Mentoring;

import java.util.Scanner;

public class ReverseStringOrNumber {

    public static void main(String[] args) {
/// read the question carefully and understand
        // start making my logic
        // I need to ask user to input some words
        // I need to reverse the string
        // i need reach out every letter
        // I need to start from last letter
        // I need to show them on console

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter words");
        String str = input.nextLine();
        int i;
        String reverse = "";
        for (i = str.length()-1; i >= 0; i--)
        {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
