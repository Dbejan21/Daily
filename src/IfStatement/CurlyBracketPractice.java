package IfStatement;

public class CurlyBracketPractice {
    public static void main(String[] args) {

        // appleNumber = 20;
        // orangeNumber = 30

        double appleNumber = 40;
        int orangeNumber = 30;

        if (appleNumber>orangeNumber) {
            appleNumber++;

            System.out.println("there more apples in the store than oranges " + appleNumber);
        }
        if (orangeNumber>appleNumber) {
            orangeNumber++;
            ++orangeNumber;
            System.out.println("there are more oranges than apples in the store " + orangeNumber);

        }
    }
}
