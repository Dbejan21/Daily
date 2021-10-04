package MAP;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        HashMap<String, Integer> map1 = new HashMap();
        HashMap<String, HashSet<Double>> map2 = new HashMap();
        HashMap<String, HashMap<String, Integer>> map3 = new HashMap();


        map.put("11", "David");
        map.put("22", "Alex");
        map.put("33", "Sorin");
        System.out.println(map);
        map.put("33", "Zack");
        System.out.println(map);

        map.put("44", "ALEX");
        System.out.println(map);
        map.put(null, "Jenny");
        System.out.println(map);
        map.put(null, "Arzu");
        System.out.println(map);
        map.put("55", null);
        map.put("66", null);
        map.put("77", null);
        System.out.println(map);

        // get();
        System.out.println(map.get("22"));
        String nullValue = map.get(null);
        System.out.println(nullValue.concat("***/***"));
//        map.get(null).concat("!!!!");

        Set<String> keys = map.keySet(); //[11, 22, 33, 44, null, 55, 66, 77]
        System.out.println(keys);

        System.out.println("***********************************************");
//[11, 22, 33, 44, null, 55, 66, 77]


        for (String key :keys) {
            System.out.println(map.get(key));

        }

    }
}
