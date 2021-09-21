package String;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sentence = new Scanner(System.in);
        System.out.println("please enter your sentence ");
      String text =sentence.nextLine();
      text = text.trim();
      text = text.replace('a', '*');
        System.out.println(text);
     text = text.replace("e", "**");
     text = text.toUpperCase();
        System.out.println(text);
     int indexOfStar = text.indexOf( '*');
        System.out.println(indexOfStar);
        System.out.println(indexOfStar*10);


        text.charAt(4);
 text.charAt((text.length()-1)/2);
 text.indexOf("a");
 int index = text.indexOf(text.charAt((text.length()-1)/2));
        System.out.println(index);

    }
}
