package MAP;

import java.util.*;


public class Practice2 {

    public static void main(String[] args) {
        HashMap <Integer, String> map = new HashMap<>();
        map.put(1, "Des plaines");
        map.put(2, "Glenview");
        map.put(3, "Chicago");
        map.put(4, "Austin");
        map.put(5, "Plano");

        System.out.println(map.size());
        map.put(null, null);
        System.out.println(map);
        map.replace(1, "XXXX");
        System.out.println(map);
        map.replace(1,"XXXX", "YYY");
        map.remove(1);
        System.out.println(map);

        System.out.println(map.keySet());

        Set<Integer> zipCodes = map.keySet();

        for (Integer zipCode : zipCodes) {
            System.out.println(map.get(zipCode));

        }
        Collection <String> cities =map.values();
        System.out.println(cities);
        for (String city: map.values()) {
            System.out.println(city);

        }

        }


        }


