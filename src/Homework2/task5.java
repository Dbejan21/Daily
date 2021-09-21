package Homework2;

public class task5 {
    public static void main(String[] args) {
      /*  Write a Java program that takes a number as input and prints its
        multiplication table up to 10.
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
...
        8 x 10 = 80 */

        int x = 8;
        int num1=1, num2=2, num3=3, num4=4,num5=5,num6=6,num7=7,num8=8,num9=9,num10=10;

        int total1= x * num1;
        int total2= x * num2;
        int total3= x * num3;
        int total4= x * num4;
        int total5= x * num5;
        int total6= x * num6;
        int total7= x * num7;
        int total8= x * num8;
        int total9= x * num9;
        int total10= x * num10;

        System.out.println(x +" * "+ num1+" = "+ total1);
        System.out.println(x +" * "+ num2+" = "+ total2);
        System.out.println(x +" * "+ num3+" = "+ total3);
        System.out.println(x +" * "+ num4+" = "+ total4);
        System.out.println(x +" * "+ num5+" = "+ total5);
        System.out.println(x +" * "+ num6+" = "+ total6);
        System.out.println(x +" * "+ num7+" = "+ total7);
        System.out.println(x +" * "+ num8+" = "+ total8);
        System.out.println(x +" * "+ num9+" = "+ total9);
        System.out.println(x +" * "+ num10+" = "+ total10);


    }
}
