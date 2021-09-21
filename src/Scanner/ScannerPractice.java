package Scanner;


import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // this is scanner object

        String firstName = "Fluffy";
        String lastName = " Brown";

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println("Please enter some string");
       String random  = input.nextLine();

        System.out.println(random);

        String middleName;
        middleName = input.nextLine();
        System.out.println(firstName+middleName+lastName);




    }
}
