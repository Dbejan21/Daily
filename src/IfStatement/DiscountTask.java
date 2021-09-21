package IfStatement;

public class DiscountTask {
    public static void main(String[] args) {
        /*
        if ur payment is $100 or more u will get 20% otherwise 5%
        print out discouneted total
         */

        double payment = 80;
        payment-= payment*0.2;

        if (payment >=100){
            System.out.println("your discount will be after 20% off "+payment );


        }
        else {
            payment-= (payment * 0.05);
            System.out.println("your payment after 5% : " +payment);
        }
    }
}
