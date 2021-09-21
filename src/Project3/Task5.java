package Project3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your sentence of three words here : ");
        String sentence = input.nextLine();

        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        System.out.println(firstWord);

       String secondWord = sentence.substring(sentence.indexOf(" "), sentence.indexOf(" ", sentence.indexOf(" ")+1) ).trim();
        System.out.println(secondWord);

        String thirdWord = sentence.substring( sentence.indexOf(" ", sentence.indexOf(" ")+1)).trim();
        System.out.println(thirdWord);

        int lastCharFirstWord =firstWord.length()-1;
        System.out.println(lastCharFirstWord);

        int lastCharSecondWord = secondWord.length()-1;
        System.out.println(lastCharSecondWord);

        int lastCharThirdWord = sentence.length()-1;
        System.out.println(lastCharThirdWord);

        System.out.println("Sum is " +(lastCharFirstWord+lastCharSecondWord+lastCharThirdWord));

    }
}
