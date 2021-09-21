package String;

import java.util.Locale;

public class Method {
    public static void main(String[] args) {
        String string = "Selenium";

        // .toUpperCase(); // it will convert all string to upper case

        string = string.toUpperCase();
        System.out.println(string);
        // .toLowerCase(); to convert to lower case

        string = string.toUpperCase();
        System.out.println(string.toLowerCase());

      String a = ("" +string.charAt(0));
      a =a.toUpperCase();
        System.out.println();


       // =============================================================

        String word = "do whatever it takes";
        System.out.println( word.startsWith("do"));// --> true

        System.out.println(word.startsWith( " what")) ;//---> false
        word.startsWith( "d"); //---> true
        word.startsWith( "d o");// ---> false

        //===========================================
        System.out.println(word.endsWith("takeS")); // true
        System.out.println(word.endsWith("it")); // false

        //=========================================================

        System.out.println("*************************");

        String text = "Techtorial";
        System.out.println(text.contains("t"));

        text = text +word; // Techtorial do what ever takes
        System.out.println(text.contains("do")); /// true

        System.out.println(text.contains("for")); // false

        System.out.println(text.contains("i")); //true










       // word.startWith( "do w");// ---> true


    }
}