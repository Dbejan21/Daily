package Loops;

public class Practice6 {

    public static void main(String[] args) {
        /*
        Summer ---> print out every single letter from this word one by one
        s, u , m,m,e,r
         */

        String word = "Summer";

      int length = 0;

        while (length<word.length()){

            System.out.print(word.charAt(length) + ", ");
            length++;

        }


       /* System.out.println(word.charAt(0));
        System.out.println(word.charAt(1)); */
    }
}