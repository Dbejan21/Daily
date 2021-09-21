package Homework0;

public class TemperatureConverter {

    public static void main(String[] args)
    {
        int Celsius, Fahrenheit;
        Fahrenheit = 212;
        Celsius = ((Fahrenheit - 32) * 5) / 9;

        System.out.println(Fahrenheit + "F in Celsius is " + Celsius + "C.");
    }
}
