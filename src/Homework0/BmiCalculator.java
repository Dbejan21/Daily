package Homework0;

public class BmiCalculator
{
    public static void main(String[] args)
    {
        double m, h, BMI;
        m = 65;
        h = 1.65;
        BMI = m / (h * h);

        System.out.println("Your BMI is "+BMI+ ".");
    }
}
