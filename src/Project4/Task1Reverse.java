package Project4;

import java.util.Scanner;

public class Task1Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any word: ");
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
