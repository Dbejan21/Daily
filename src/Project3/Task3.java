package Project3;

public class Task3 {
    public static void main(String[] args) {

        /*TASK-3Please use method chaining for the following Strings.
        // Methods are provided next to theString.String “
        // Snicker “; —> trim, toUpperCase, substring and charAt methods
        String “Cookie” —> toLowerCase, replace ‘o’ with ‘u’, concat with ’s’, starts with ‘C
         */

        String text1 = "  Snicker";
        String text2 = "Cookie";

        char word = text1.trim().toUpperCase().substring(3).charAt(0);
        System.out.println(word);

        Boolean word1 = text2.toLowerCase().replace ('o','u').concat("s").startsWith("C");
        System.out.println(word1);

    }
}
