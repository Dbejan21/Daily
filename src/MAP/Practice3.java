package MAP;

import java.util.*;

public class Practice3 {
    public static void main(String[] args) {

        HashMap<String, Integer> dataMap = new HashMap<>();
        dataMap.put("IT", 111);
        dataMap.put("HR", 222);
        dataMap.put("Help", 333);
        dataMap.put("Admin", 444);

        // entrySet
        System.out.println(dataMap);
        Set<Map.Entry<String, Integer>>data = dataMap.entrySet();

        System.out.println(dataMap.entrySet());
        System.out.println(data);

        for (Map.Entry<String, Integer> keyAndValue :data){
            System.out.println(keyAndValue);
        }


        // create a method which takes a parameter of map , and this method will print out each extension one by one

      //  printValues(dataMap);
    }
    public static void printValues (HashMap<String, Integer> map1){


        for (Integer ext : map1.values()) {
            System.out.println(ext);
        }
        }
}

