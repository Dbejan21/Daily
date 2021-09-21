package Primitives;

public class ArithmeticOperators
{
    public static void main(String[] args)
    {
        // Arithmetic operators are +,-,*,/,% (modulus)
        int a = 9;
        int b = a + 9; //this is number of people
        int carCount = b * 2; // if each person has 2 cars

        int finalCarCount = carCount - 10;
        System.out.println(finalCarCount);

        int numberOfRows = finalCarCount / 3;
        System.out.println(numberOfRows);

        double division = a / 2;
        System.out.println(division);
        int division1 = a / 2;
        System.out.println(division1);

        double division3 = a / 2d;
        System.out.println(division3);

        double base = 5, height = 3, area;

        area = base * height / 2;

        System.out.println(area);
    }

}



