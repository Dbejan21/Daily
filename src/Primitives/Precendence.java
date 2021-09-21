package Primitives;

public class Precendence
{
    public static void main(String[] args) {
        int count = 10+15; //25
        int count1 = count + 3*5; // 25+15

        System.out.println(count);
        System.out.println(count1);

        int count2= count - count1 / 2*3; // 25 - 40 / 2*3 =  40/2
        System.out.println("count2 -->"+count2); // -35

        int count3 = 6 / 3 * 5 % 3;
        System.out.println("count 3 --> "+count3);

        int count4 = 6-4-count + count3;
        System.out.println(count4);
        System.out.println("total of count3 and count4 ---> " + (count3+count4)); // -21

        // $50 food, $250 for electronics $80 for shoes
        // 10%            20%              15%

        // 50 *0.10   250*0.20           80*0.15
double payment = 50 +250 + 80 + (50* 0.10)+(250*0.20)+(80*0.15);
        System.out.println(payment);

        double number = 20*(.1+500)*2 +30*.07; // .1+500 * 20   total of this * 2 and add 30 and then * 0.07
        System.out.println(number);

    }



}
