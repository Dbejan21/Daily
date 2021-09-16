package Project4;

import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number between 1-10");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++)
        {
            System.out.print("\n");
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
        }
    }
}
