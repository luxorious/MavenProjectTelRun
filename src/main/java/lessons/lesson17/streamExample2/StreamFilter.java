package lessons.lesson17.streamExample2;

import java.util.Arrays;
import java.util.Collection;

public class StreamFilter {
    private static void findAndSkipCount(){
        Collection<String> collections = Arrays.asList("a1", "a2", "a3", "a1");

        System.out.println("Find first and skip");
        String first = collections.stream().findFirst().orElse("Test1");
        String last = collections.stream().skip(collections.size()-1).findAny().orElse("Test1");
        System.out.println("1st elem - " + first);
        System.out.println("last elem - " + last);

        String a3elem = collections.stream().filter("a3" :: equals).findFirst().get();
        System.out.println("a3elem - " + a3elem);

        String fourthElem = collections.stream().skip(3).findFirst().get();
        System.out.println("4-th elem - " + fourthElem);

    }

    public static void main(String[] args) {
        findAndSkipCount();
    }
}
