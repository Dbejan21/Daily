package Primitives;

public class CharPractice {
    public static void main(String[] args) {
        char firstLetter = 'A';// value for a char data needs to be in the single quotation mark 'A'

        System.out.println(firstLetter);

        char secondLetter = '6';
        System.out.println(secondLetter);

        char thirdLetter = '^';
        System.out.println(thirdLetter);

        char fourthLetter = 66;
        System.out.println(fourthLetter);

        // char fourthLetter ='66';// you can only store single quotation mark for char

        char fifthLetter = 255;

        double d = '?'; //if you assign a symbol / charter from ASCII table, it will print the number/value for it
        System.out.println(d);

        int h = '#';

        System.out.println(h);

        int c = 'C', k = 'K', g = 'G', t = 'T', e = 'E', m = 'M';
        System.out.println("" + c + " ---" + k + " ---" + t + " " + t + " ---" + e + " ---" + m);
        System.out.println(c + k + d + e + m);
    }
}
