package SET;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {


        HashSet set1 = new HashSet();
        HashSet <String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();

        set1.add("Chicago");
        set1.add("Dallas");
        set1.add("Denver");
        set1.add("Columbus");
        set1.add("New York");
        set1.add(12);
        set1.add(true);
        System.out.println(set1);
        set1.add(null);
        System.out.println(set1);
        set1.add("Chicago");
        System.out.println(set1);
        set1.size();

//        for (Object x:set1) {
//            if (x.equals("Denver")){
//                if(!x.equals(null)){
//                    System.out.println(x);
//                }
//            }
//

        set1.remove(null);
        System.out.println(set1);
        for (int i = 0; i < set3.size(); i++) {
            if (set1.contains("Denver")){
                System.out.println("Denver");

                break;
            }
        }
set1.clear();
        System.out.println(set1);
        }

    }









