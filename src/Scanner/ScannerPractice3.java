package Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = scanner.nextLine();
        System.out.println("you entered this value --> " + fullName);
        System.out.println("what is your state ");
       char firstLetter = scanner.next().charAt(3); // indexing
                                                   //  Illinois //
                                                   //  01234567
        System.out.println(firstLetter);

    }
}
