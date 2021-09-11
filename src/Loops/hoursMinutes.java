package Loops;

public class hoursMinutes {
    public static void main(String[] args) {
        // create a digital clock that prints hours and minutes
        // hours from0 to 12
        // minutes 0 to 59
        for (int a = 0; a < 2; a++) {


            for (int hour = 0; hour < 12; hour++) {

                for (int mins = 0; mins <= 60; mins++) {
                    if (a == 0) {

                        System.out.println(hour + " : " + mins + "  am");
                    } else {
                        System.out.println(hour + " : " + mins + "  pm");
                    }
                }

            }
        }
    }
}

