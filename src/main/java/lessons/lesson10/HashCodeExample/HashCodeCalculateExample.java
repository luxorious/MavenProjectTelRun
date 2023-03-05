package lessons.lesson10.HashCodeExample;

public class HashCodeCalculateExample {

    public static void main(String[] args) {
        /*
        Alex a(1) + l(12) + e(5) + x(24) = 42
        Bob b(2) + o(15) + b(2) = 19
        Dirk d(4) + i(9) + r(18) + k(11) = 42
        Fred f(6) + r(18) + e(5) + d(4) = 33
         */
        Person firstPerson = new Person("Vasya");
        Person secondPerson = new Person("Petya");
        Person person3 = new Person("Vasya");


        System.out.println(firstPerson.hashCode());
        System.out.println(firstPerson.hashCode());
        System.out.println(secondPerson.hashCode());
        System.out.println(secondPerson.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person3.hashCode());
    }
}
