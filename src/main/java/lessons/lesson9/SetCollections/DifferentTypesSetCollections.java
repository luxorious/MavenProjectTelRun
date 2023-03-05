package lessons.lesson9.SetCollections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;

public class DifferentTypesSetCollections {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();


        sortedSet.add("A");
        sortedSet.add("B");
        sortedSet.add("C");
        sortedSet.add("d");
        sortedSet.add("e");
        sortedSet.add("f");
        sortedSet.add("g");
        sortedSet.add("h");
        sortedSet.add("r");
        sortedSet.add("w");
        sortedSet.add("s");


        sortedSet.add("A");
        sortedSet.add("c");

        System.out.println(sortedSet);

        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());

        for (String str:sortedSet) {
            System.out.print(str + ", ");
        }

        String checkContains = "d";

        System.out.println();
        System.out.println("inside " + checkContains + " " + sortedSet.contains(checkContains));

        sortedSet.remove("A");
        System.out.println("after removing - " + sortedSet);

        for (String str: sortedSet){
            System.out.print(str + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------");

        set.add("Apple");
        set.add("Lemon");
        set.add("Banana");
        set.add("Apple");

        Iterator<String> itr = set.iterator();
        System.out.println("Fruits set");
        while (itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }
        System.out.println();
    }
}
