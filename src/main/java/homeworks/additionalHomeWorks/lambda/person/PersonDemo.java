package homeworks.additionalHomeWorks.lambda.person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDemo {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Ivan", 29),
                new Person("Pavlo", 22),
                new Person("Petro", 23),
                new Person("Lilia", 26),
                new Person("Ivanka", 19),
                new Person("Lina", 22),
                new Person("Andriy", 18),
                new Person("Vasyl", 27),
                new Person("Vasyl", 28)
        );
        people = people.stream()
                        .sorted(Comparator.comparing(Person::getName))
                                .collect(Collectors.toList());

        people.stream()
                        .forEach(o -> System.out.println(o));

        System.out.println(people);


        System.out.println("-------------------------------");

        List<Person> personCriteria = (people.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() <= 25).toList());

        personCriteria.stream()
                .forEach(System.out::println);

        System.out.println("-------------------------------");
    }
}

//    Напишіть програму, яка використовує лямбда-вирази для вирішення наступних задач:
//
//   +     Створити список об'єктів класу Person.
//   +     Відсортувати список за ім'ям.
//   +     Вивести всі об'єкти зі списку.
//   +     Створити другий список, який містить об'єкти Person з віком від 18 до 25 років.
//   +     Вивести всі об'єкти з другого списку.
//   +     Використовуйте методи Stream для розв'язання цієї задачі.