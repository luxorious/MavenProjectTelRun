package homeworks.additionalHomeWorks.HWlesson6.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordFinderTest {
    static UniqueWordFinder ufw = new UniqueWordFinder();
    static String str = "Hello My Dear Friend, How Are You?";

    public static void main(String[] args) {
        System.out.println(findTest(str));
        System.out.println("-----------------------------");
    }

    public static boolean findTest(String string){
        String[] arr = new String[]{"How", "Dear", "Hello", "Friend", "Are", "My", "You"};
        Set<String> expect = new HashSet<>(List.of(arr));
        if (ufw.find(str).equals(expect)){
            return true;
        } else {
            System.out.println("result - " + ufw.find(str) +
                    " but expect - " + expect);
            return false;
        }
    }
}
