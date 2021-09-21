package Primitives;

import java.sql.SQLOutput;

public class UnaryOperators {
    public static void main(String[] args) {


        int studentNumber = 25;

        studentNumber = studentNumber + 1;
        System.out.println(studentNumber);

        studentNumber += 1;
        System.out.println(studentNumber);

        studentNumber++;
        System.out.println(studentNumber);

        ++studentNumber;
        System.out.println(studentNumber);

        studentNumber--;
        System.out.println(studentNumber);

        --studentNumber;
        System.out.println(studentNumber);

        studentNumber--;
        studentNumber--;
        studentNumber--;

        System.out.println(studentNumber);


        studentNumber++;
        studentNumber--;

        System.out.println(studentNumber++); // --> 24; but increase afterwords, student number is now 25
        System.out.println(studentNumber);

        System.out.println(++studentNumber);

        studentNumber--; //24
        --studentNumber; // 23

        System.out.println(--studentNumber); //
        System.out.println(studentNumber);

        int a = studentNumber++ + studentNumber++ + 5;
        a--;
        a = studentNumber;

        System.out.println(a--);


    }
}
