package lessons.lesson17.streamExample3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Ruslan", Arrays.asList("+234562345", "+2134567")),
                new Human("Victor", Arrays.asList("+345454367", "+4356557")),
                new Human("Petr", Arrays.asList("+654345645", "+3456543"))
        );

        List<String> phonesNumbers = new ArrayList<>();
        for (Human h : humans){
            phonesNumbers.addAll(h.getPhones());
        }

        System.out.println(phonesNumbers);

        List<String> phonesSecondCopy = humans.stream()
                .map(human -> human.getPhones())
                .flatMap(phones -> phones.stream())
                .collect(Collectors.toList());

        System.out.println(phonesSecondCopy);


    }
}
