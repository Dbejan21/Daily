package Variables;

public class Practice2 {

    public static void main(String[] args){
        int apples= 10;
        int oranges = 20;
        int kiwi = 30;

        System.out.println( oranges);
        System.out.println(kiwi);
        System.out.println("total number of fruits= "+apples+oranges+kiwi);//this will show as total number of fruits= 102030
        System.out.println("total number of fruits = " +(apples+oranges+kiwi) );// this will show correct total number of fruits = 60/
        System.out.println(apples+oranges+ " is total of apples and oranges");
        System.out.println("the total number of apples and kiwi is "+ (apples+kiwi) +  " and difference between kiwi and orange is " + (kiwi-oranges) +".");
    }
}
