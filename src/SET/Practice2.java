package SET;

import java.util.*;

public class Practice2 {

    public static void main(String[] args) {

        HashSet <Integer> hashSet = new HashSet<>();

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        TreeSet <Integer> treeSet = new TreeSet<>();
// null , random order                            // insertion order                 /// null , ascending
        hashSet.add(99);                       linkedHashSet.add(28);                treeSet.add(31);
        hashSet.add(12);                       linkedHashSet.add(27);                 treeSet.add(32);
        hashSet.add(55);                        linkedHashSet.add(23);               treeSet.add(33);
        hashSet.add(14);                        linkedHashSet.add(24);               treeSet.add(34);
        hashSet.add(null);                      linkedHashSet.add(null);             //treeSet.add(null);
        System.out.println(hashSet);            System.out.println(linkedHashSet);     System.out.println(treeSet);
        System.out.println("**********");       System.out.println("**********");      System.out.println("**************");

        for (Integer number: treeSet) {
          boolean b =  number.toString().equals("35");
            System.out.println(b);
            String str = number ==35 ? "I found 35": "could not find 35";
            System.out.println(str);

        }

        //[31, 32, 33, 34]
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
       // [null, 99, 55, 12, 14]
        Iterator iterator1 = hashSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());

    }
        ArrayList <String > veggies = new ArrayList<>();

        veggies.add("tomato");
        veggies.add("lettuce");
        veggies.add("carrot");

        Iterator iterator2 = veggies.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());

}
        Collections.sort(veggies);
        System.out.println(veggies);


// convert arraylist to set
    HashSet set1 = new HashSet(veggies);
        System.out.println("this is list to set : " +set1);

        //set to arrayList
        ArrayList list1 = new ArrayList(set1);
        System.out.println("this is a new ArrayList from set: "+ list1);
        list1.add("tomato");
        System.out.println(list1.get(2));

}
}