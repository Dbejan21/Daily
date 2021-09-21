package Methods;

public class MathPrc {
    public void sum (int a, int b){
//
//        int a =2;
//        int b = 3;
        int sum = a+b;


        System.out.println("the sum of " +a+ "and" +b+ "is "+ sum);

    }
    public int sum1 (int a, int b, int c) {
//
//        int a =2;
//        int b = 3;
        int sum = a + b + c;


        System.out.println("the sum of " + a + "and" + b + "is " + sum);
        return sum;
    }

// create a method that will take String parameters for
// name of operation and two other parameters  as int data type
    // this method will print the results according to provided operation

    public void operation (String operation, int a, int b) {
        switch (operation) {

            case "add":
                System.out.println("the sum is " + (a+b));
                break;
            case "subtract":
                System.out.println("the subtraction is " + (a-b));
                break;
            case "multipl":
                System.out.println("the multipl is " + (a*b));
                break;

            case "divition":
                System.out.println("the division is " + (a/b));
                break;

            case "remainder":
                System.out.println("the modulus is " + (a%b));
                break;

            default:

                System.out.println("invalid entry");

        }

    }


}

