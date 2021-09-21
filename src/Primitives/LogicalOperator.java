package Primitives;

public class LogicalOperator {

    public static void main(String[] args) {


       int myAge = 15;

       boolean myDress = true;

       int ageReq = 21;
       boolean dressCode = true;

       Boolean can_I_attend = myAge >= ageReq && myDress == dressCode;
        System.out.println(can_I_attend);


        Boolean can_I_attend2= myAge <= ageReq && myDress == dressCode;
        System.out.println(can_I_attend2);

        //================================================================================


        int myNewAge =28;

        boolean myMoney = false;

        int ageRequirement = 18;
        boolean moneyRequirement = true;

        boolean can_I_go = myNewAge >= ageRequirement || myMoney == moneyRequirement;

        System.out.println(can_I_go);
        myNewAge = 8;
        can_I_go = myNewAge >= ageRequirement || myMoney == moneyRequirement;

        myMoney = true;
        can_I_go = myNewAge >= ageRequirement || myMoney == moneyRequirement;
        System.out.println(can_I_go);



    }
}
