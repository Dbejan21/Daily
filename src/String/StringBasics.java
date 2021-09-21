package String;

import javax.tools.JavaCompiler;
import java.util.Locale;

public class StringBasics
{
    public static void main(String[] args) {
        // string name = "fluffy"

        String text = "School";
        String name = new String("Diana ");

        System.out.println(text);
        System.out.println(name);

        text = text + " is Techtorial";
        System.out.println(text);
        text += " Academy";
        System.out.println(text);

        String word = name + text;
        System.out.println(word);

        String str = "Java";
        String str1 = "Selenium";
        String result = str + " " + str1;
        System.out.println(result);
        str = str + 5 + 6;
        System.out.println(str);
        str1 = str1 + "5" + "6";
        System.out.println(str1);
        str = "Java";
        str = str + 5 * 6; // here we reassign the value of str -->Java30
        System.out.println(str);
        System.out.println(str+15/3);

        str = "Java";

        int a = 12;
        str.concat(" is cool");
        System.out.println(str);
        str = str.concat(" is very easy");
        System.out.println(str);
        str= str.toUpperCase();
        System.out.println(str);


    }
}