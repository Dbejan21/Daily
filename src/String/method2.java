package String;

import sun.security.rsa.RSAUtil;

public class method2 {
    public static void main(String[] args) {

        String name ="Diana";

        name.indexOf('D');
        System.out.println( name.indexOf('D')); //'D' ---> 0
        name.indexOf ("D"); //'D' ---> 0
        System.out.println( name.indexOf ("D"));//'D' ---> 0

        name.indexOf("Di"); // 'D' ---> 0
        System.out.println( name.indexOf("Di"));

        System.out.println(name.indexOf("ana")); // 2 it looks for  matching sequence of provided chars and returns first matching char's index

        System.out.println(name.indexOf("anan")); // -1 theres no matching char sequence

        System.out.println(name.indexOf("k")); /// -1 there is no matching

        name.concat(" Bejan");
        System.out.println(name.concat( " Bejan")); // diana Bejan
        name = name.concat(" Bejan");
        System.out.println(name); // Diana Bejan

        System.out.println(name.indexOf( "a", 3)); // it will start looking for that char starting from given index
        // Arzu Beril Sen
        System.out.println(  name.indexOf("B", name.indexOf(" ")));

        name= "Arzu Beril Sen";
        System.out.println(  name.indexOf("e",7)); /// it will look for that l
        System.out.println(name.indexOf("e",name.indexOf(" ")+3));
       // name.indexOf();// values that you are giving inside of the method parentheses are called paramteers same methods tale parameters, some take single parameters or multiple parameters

        name.length(); // no parameters
        name.charAt(3); //single parameters
        name.indexOf("e", 4); //you can pass either one or two parameters by separation them comma





}
    }

