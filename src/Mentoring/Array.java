package Mentoring;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

       String name = "Hello Java is so cool";

        String[] words = name.split(" ");
        System.out.println(Arrays.toString(words));


        for (int i = 0; i < words.length; i++) {
            String reverse = " ";
            for (int j = words[i].length()-1; j >=0;j--) {
                reverse+=words[i].charAt(j);


            }

            System.out.println(reverse.charAt(0));
            System.out.println(reverse.charAt(reverse.length()-1));
            System.out.println(reverse);

        }



    }
}
