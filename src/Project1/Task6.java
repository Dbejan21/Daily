package Project1;

public class Task6 {
    public static void main(String[] args) {
        int minutesGiven = 3456789;
        int minutesPerHour = 60;
        int hoursPerDay = 24;
        int minutesPerDay = minutesPerHour * hoursPerDay;


        System.out.println("Total number of minutes per day  " +minutesPerDay);

        int daysPerYear= 365;
        int minutesPerYear = minutesPerDay * daysPerYear;

        int  totalYear = minutesPerDay * daysPerYear;

        System.out.println("Total number of minutes per year  " + totalYear);
        int totalYears = minutesGiven / minutesPerYear;

        int leftOverMin = minutesGiven - (minutesPerYear * totalYears);
        int totalDays = leftOverMin / minutesPerDay;

        System.out.println("3456789 minutes is approximately " + totalYears + " years and "+ totalDays + " days.");



    }
}
