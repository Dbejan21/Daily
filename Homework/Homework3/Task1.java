package Homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("  Enter your first word ");
        String text1 = scanner.nextLine();
        System.out.println("Enter your second word");
        String text2 = scanner.nextLine();
        String text = "";
        if (text1.length() > text2.length()) {
            text = (text1.substring(0, text2.length())).concat(text2);

        } else if (text2.length() > text1.length())
            text = (text2.substring(0, text1.length())).concat(text1);
        else
            text = text1.concat(text2);
        System.out.println(text);




    }
}
