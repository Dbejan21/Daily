package Primitives;

public class DataTypes {

    public static void main(String[] args)
    {
         /*
    there are 8 different primitive data types
    byte, short, int, long, float, double, --> for numbers
    char --> for single characters
    boolean --> for true and false
     */
        byte number = 6;
    //byte number1 = 129 will not work, bc range is -128 to 128-->compile time error

        short number2 = 100;
        short number3 = 31257;
        short number4;

        int number5 = 32_000; // you can use underscore (_) in between digits
        int number6 = 1_000_000;

        System.out.println(number6);

        long number7 = 341345;
        long number8 = 74_92_813_0841l;// you should use l/L at the end of long values

        System.out.println(number8);

        float number9 = 2.3f; // u should add f/F at the end of float value
        float number10 = 56; //56--> 56.0

        System.out.println("Value of number10 --> " + number10);

        float number11 = 56.0f;

        double number12 = 2.1;
        double number13 = 89; // 89-->89.0  double data type can store int values
        //most common data types int, double, long, boolean
    }
}

