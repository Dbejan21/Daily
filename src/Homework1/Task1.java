package Homework1;

public class Task1 {
    public static void main(String[] args)
    {
        //Write a Java program to convert minutes into a number of years and days//


        int minutes =3456789;
        int daysPerYear = 365;
        int minutesPerHour = 60;
        int hoursPerDay = 24;

        int minutesPerDay = minutesPerHour * hoursPerDay;
//        int minutesPerYear = minutesPerDay * daysPerYear;
       int  minutesPerYear = minutesPerHour*hoursPerDay*daysPerYear;
        int year = minutes / minutesPerYear;
        int remainingMinutes = minutes % minutesPerYear;
        int day = remainingMinutes / minutesPerDay;

        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");

    }
}
