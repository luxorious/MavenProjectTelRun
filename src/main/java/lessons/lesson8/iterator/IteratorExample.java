package lessons.lesson8.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();

        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");
        Cat cat3 = new Cat("cat3");
        Cat cat4 = new Cat("cat4");
        Cat cat5 = new Cat("cat5");

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        System.out.println(cats.toString());

//        cats.remove(cat3);
        System.out.println(cats.toString());

        for (Cat cat: cats){
//            if(cat.name.equals("cat3")){
//                cats.remove(cat);
//            }
        }

        System.out.println(cats.toString());

//        --------------------------------------------
        System.out.println("--------------------------------------------");
        System.out.println("part2");
        System.out.println("--------------------------------------------");

        Iterator<Cat> catIterator = cats.iterator();

//        while(catIterator.hasNext()){
//            System.out.println(catIterator.next());
//        }

        while(catIterator.hasNext()){
            Cat tmpCat = catIterator.next();
            if(tmpCat.name.equals("cat3")){
                catIterator.remove();// як видаляє без аргумента
            }
            System.out.println(cats);
        }


    }
}
