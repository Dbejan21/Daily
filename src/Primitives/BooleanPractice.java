package Primitives;

public class BooleanPractice
{
    public static void main(String[] args)
    {
        //for a boolean data type you can give values true or false
        boolean isLightOn = true;
        boolean isBreakTime;

        isBreakTime = isLightOn;
        System.out.println(isLightOn);
        System.out.println(isBreakTime);

        boolean isClear = false;
        System.out.println(isClear);
        // System.out.println(isBreakTime +isClear);// it will not compile
        System.out.println("!!!!!" + isBreakTime + isClear);

        boolean bl1 = true;
        boolean bl2 = false;

        int i1 = 5;
        int i2 = 5;
        int i3 = 10;
        // is i1 equals to i2? yes --> true i1==i2 --> true
        //is i1 equals to i3? no --> false i1==i3 --> false

        boolean isi1EqualsToi2;
    }
}
