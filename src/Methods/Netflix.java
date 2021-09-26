package Methods;

public class Netflix {

        String accName;
        String userName;
static int monthlyData =200;

    public int usage(int data) {

        return monthlyData = monthlyData-data;

    }

    public static void main(String[] args) {
        Netflix flix = new Netflix();

        flix.usage(12);
        System.out.println(monthlyData);
        System.out.println(flix.accName);
        flix.usage(10);
        System.out.println(flix.monthlyData);

        Netflix kids= new Netflix();
        kids.usage(2);
        System.out.println(kids.monthlyData);
    }
}

