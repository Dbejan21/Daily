package HomeWork8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int allLine=scanner.nextInt();
        int numbersToBePrinted=0;
        for (int l = 1; l <=allLine ; l++) {
            // This loop will repeat line times
            for (int i = 1; i <=l ; i++) {
                System.out.print(++numbersToBePrinted);
            }
            // This is used for jumping the next line
            System.out.println();
        }
    }
}
