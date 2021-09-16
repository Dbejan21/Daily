package Loops;

public class hoursMinutes {
    public static void main(String[] args) {
        // create a digital clock that prints hours and minutes
        // hours from0 to 12
        // minutes 0 to 59

        for (int a = 0; a < 2; a++) {
            if (a == 0) continue;
            LABEL :

            for (int hour = 0; hour < 12; hour++) {
                if (hour >4  && hour <8  )
                    continue;


                    for (int mins = 0; mins < 60; mins++)
                {
                    if (hour >=10 ){
                        break LABEL;
                    }
                    if (a == 0)
                {
                        System.out.println(hour + " : " + mins + "  am");

                    }
                    else
                    {
                        System.out.println(hour + " : " + mins + "  pm");
                    }
                }

            }
        }
    }
}

