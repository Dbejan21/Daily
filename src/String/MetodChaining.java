package String;

public class MetodChaining {
    public static void main(String[] args) {
        //TASK: Ask user to enter a String value which shuold have space at the beginning or end
        //    - Replace all letter 'a's with single '*' and letter 'e's with double '**',
        //    - change all string value to UPPERCASE
        //    - Find index of First '*'
        //    - Multiply that value by 10 and
        //    - Print out the result

        String text = "  just do it  ";
        int x = text.replace('a', '*').trim().replace("e", "**").toUpperCase().indexOf('*'); //-1
        System.out.println(x);

        char ch = text.replace('a', '*').trim().replace("e", "**").toUpperCase().charAt(0); //j
        System.out.println(ch);

        String a = text.replace('a', '*').trim().replace("e", "**").toUpperCase();
        System.out.println(a); // JUST DO IT


    }
}
