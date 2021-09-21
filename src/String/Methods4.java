package String;

public class Methods4 {
    public static void main(String[] args) {

        String a = "John";

        String b = "John";
         boolean bl1 =  a.equals(b);//  ---> true
        System.out.println(bl1);


        boolean bl2 = a.equals("JohN"); // false
        System.out.println(bl2);

        String c = "JOHN";
        System.out.println(a.equals ("c")); // false

        //=====================

        //equalsIgnore()

       boolean bl25 = a.equalsIgnoreCase(c);// true
        System.out.println(bl25);

        System.out.println("Java is".equalsIgnoreCase("JAVA is")); // true

        System.out.println("Java is cool".equalsIgnoreCase("Java is")); // false

        String str1 = "Java is cool";

        /// replace() it will replace original value with new one.

        str1 = str1.replace('o', '$');
        System.out.println(str1);

        str1 =str1.replace("c$$l", "easy");

        String text1 = "Tava";

        str1 = str1.replace("Java", text1);
        System.out.println(str1);

        String star = "Star of the day is *";

        System.out.println(star.replace("*","$$$$"));


        // ---------------trim ==============

     String text2 = "   It is Saturday    ";

     text2 =text2.trim();
        System.out.println(text2);

        // "Do whatever takes"

        String str3 = "Do whatever takes";

      str3 =str3.concat(" to learn Java.");

        System.out.println(str3);
        System.out.println(str3.toUpperCase());
        str3 = str3.replace("JAVA","JOB");
        System.out.println(str3.contains("Chicago"));



      /*  ASK: Ask user to enter a String value which shuold have space at the beginning or end
        - Replace all letter 'a's with single '*' and letter 'e's with double '**',
                - change all string value to UPPERCASE
                - Find index of First '*'
                - Multiply that value by 10 and
                - Print out the result */


        String word = "  Good morning  ";


    }
}
