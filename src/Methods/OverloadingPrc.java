package Methods;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class OverloadingPrc {
    // create a method that will take two double parameters
    // this method will be named as areaCalculator
    // it will return the area
    // formula A= length *width

    public double areaCalc(double length, double width) {

        double area = length * width;
        return area;

    }

    public static void main(String[] args) {
        OverloadingPrc object = new OverloadingPrc();

        System.out.println(object.areaCalc(1.2, 3.4));
        double area = object.areaCalc(3, 4.5);
        System.out.println(area);

    }


// calculate the area for a square
    // formula >> A = l * l

    public double areaCalculator(double length) {

        double area = length * length;
        return area;


    }

    private int areaCalculator(String length) {
        int a = 5;
        int b = 9;
        int sum = a + b;
        return sum;
    }

}