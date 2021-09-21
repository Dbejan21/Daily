package String;

public class Substring {
    public static void main(String[] args) {

        String str = "Techtorial";

        String part1 = str.substring(2); // when you pass single index it will subtract
        System.out.println(part1);

        String part2 = str.substring(2, 4); // when you pass begening and ending numbers, it will start from begining index which is
        // included and stop at ending which is not included
        System.out.println(part2);
        System.out.println(str.substring(0));


        /// print last three chars from string "I will do it SOON"

        String str2 = "I will do it SOON";

        System.out.println(str2.substring( str2.length() -3));

        String str3 = "ON";
        System.out.println(str3.substring( str2.length() -3));
        // when your string value does not have enough value to take substring
        // it will throw in an exception (StringOutOfBound)




    }
}