package Loops;

public class ForLoop2 {
    public static void main(String[] args) {
        // print out the letters from given String value
        /// chicago
        // print out the letters starting from end of the string
        // print out only letter  from this String

        String city = "Chicago";

        for (int i = 0; i <= city.length() - 1; i++)
            System.out.print(city.charAt(i));


        for (int index = city.length() - 1; index >= 0; index--) System.out.println(city.charAt(index));

        System.out.println("=================================================================");

        //count o's int the string

        String string = "today is the day to practice for Loop";
        int count =0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'o') {
                System.out.println(string.charAt(i));
                count ++;
                System.out.println("the index number of "+count+ ". 'o' is "+i);
            }
            System.out.println(count);
        } // "the index number of o is" (show index of each letter 'o'



        }
    }





