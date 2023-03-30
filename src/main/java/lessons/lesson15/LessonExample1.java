package lessons.lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LessonExample1 {
    public static void main(String[] args) {
        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(5);

        System.out.println(joinNumber(myNumbers));
    }

    public static StringBuilder joinNumber(Collection<?extends Integer> numbers){
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (Integer number : numbers){
            if (first){
                first = false;
            } else {
                result.append(", ");
            }
            result.append(number);
        }
        return result;
    }
}
