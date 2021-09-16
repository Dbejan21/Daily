package Mentoring;

//  ask user to enter one string value with three word
//1- Print first letter of each word
//2- Print last letter of each word
// 3-Print the sum of last letter of each word's index number
// 4-Print the sum of first letter of each word's index number
//    Example: "Java String Test"
//    Output:
//    JST
//    agt

import java.util.Scanner;

public class PlayingWithLetter {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter three word letter");
        String words = str.nextLine();
        String firsLetters = " ";
        String lastLetters = " ";
        firsLetters += words.charAt(0);

        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ') {
                firsLetters += words.charAt(i + 1);
                lastLetters += words.charAt(i - 1);
            }
        }
        lastLetters += words.charAt(words.length() - 1);
        System.out.print(firsLetters);
        System.out.println(lastLetters);
    }
}




