package Homework0;

public class WeightConverter
{
    public static void main(String[] args)
    {
        double kg, pounds, grams;
        kg =8;
        pounds = kg*2.205;
        System.out.println(pounds+ " pounds");

        grams = kg*1000;
        System.out.println(grams+ " grams");
        // or I can use like this
        //System.out.println(kg*1000);
    }
}
