package Ternary;

public class Practice1 {
    public static void main(String[] args) {


        int num1 = 5;
        int num2 = 5;
        int num3 = 6;
        double money =100;

        int result1 = num1 == num2 ? 25 : 30;
        System.out.println("result 1 is"+ result1);

       String result2 =  num1 == num3 ? "hello" : "bye";
        System.out.println(result2);

        System.out.println(num1 ==num2 ? "good" : 5);

        int result3 = num1 ==num3 ? num1++ +num2++ : num3++ + num3;
        System.out.println(result3);
      double result4 = num1 ==num3 ? money : num3++ + num3;

        System.out.println(result4);
    }
}