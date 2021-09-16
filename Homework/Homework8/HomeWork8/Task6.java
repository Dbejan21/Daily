package HomeWork8;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String str = input.nextLine().toLowerCase();

        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) System.out.println("Your string is Palindrome ");
        else {
            System.out.println("Your string is not Palindrome");
        }
    }
}
