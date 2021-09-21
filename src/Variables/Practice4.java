package Variables;

public class Practice4 {
    public static void main(String[] args){

        /* in a farm, there are 12 cows and 23 chickens.
        Each chicken cost 10
        each cow's' cost is 500$*/

        int chicken= 23;
        int cow=12;
        /* 1. calculate the total number of legs of the animals in this farm
        2. calculate the total cost of animals in the farm */
int chickenLegs=2;
int cowLegs=4;
int totalCowLegs=cow*cowLegs;
int totalChickenLegs=chicken*chickenLegs;
int totalLegs= totalChickenLegs+totalCowLegs;

        System.out.println("total number of legs is: "+totalLegs);
int cowPrice=500;
        int chickenPrice=10;
        int total$=chicken*chickenPrice + cowPrice*cow;
        System.out.println(total$);
        System.out.println(chicken*chickenPrice + cowPrice*cow);



    }

}
