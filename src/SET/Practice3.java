package SET;
import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        //you are given an array of colors

        // String []colors = {"red", "black", "black", "white", "red", "orange"}

        String []colors = {"red", "black", "black", "white", "red", "orange"};

        List list = Arrays.asList(colors);
        HashSet hashSet =new HashSet(list);
        HashSet hashSet1= new HashSet(Arrays.asList(colors));
        System.out.println(hashSet); // no dublicates, prints unique
        System.out.println(list); // stores dublicates


        // find out and store duplicate elements in to an aRRay list from this array

        ArrayList list2 = new ArrayList();

            HashSet set2 =new HashSet();
            for (String color: colors) {
                if (!set2.add(color)) {//if is not added to set2
                    list2.add(color); // then add them in list2


                }
            }
        System.out.println(set2);//[red, orange, white, black]
        System.out.println(list2+" this one has only duplicates");
        }
    }

