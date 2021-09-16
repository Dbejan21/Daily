package HomePractices;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one word");
        String str = input.nextLine();

        int i = str.length() - 1;
        String reverse = "";

        while (i >= 0) {

            reverse += str.charAt(i);
            i--;
        }
        if (str.equals(reverse)) System.out.println("Your string is Palindrome ");
        else {
            System.out.println("Your string is not Palindrome");
        }
    }
}
