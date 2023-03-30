package lessons.lesson17.streamExample1;

import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> number = List.of(1, -1, 2, -8, 3, 8, -7, 4, 5, 6, 7, 8, -9, 20, 30, 50);


        List<Integer> list = number.stream()
                .filter(n -> n > 0)
//                .forEach(n -> System.out.println(n));
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list);

        System.out.println(number);

        int minResult = number.stream()
                .filter(x -> x > 0)
                .min((x, y) -> Integer.compare(x, y))//or->
//->                .min(Integer::compare)
                .orElse(0);

        System.out.println("min = " + minResult);

        int sum = number.stream()
                .filter(x->x > 0)//count negative - change x > 0 to x < 0;
                .reduce((x, y) -> x + y)
                .orElse(0);

        System.out.println("Sum of all elems = " + sum);

    }

}
