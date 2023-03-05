package lessons.lesson6.src.person;

public class PersonDBArray {
    public static void main(String[] args) {
        Person [] personArr = new Person[3];
//        ;
//        personArr[2] = new Person("Petro", 32, 123456789);
//        personArr[3] = new Person("Viktor", 24, 123456789);
//        personArr[4] = new Person("Vladyslav", 19, 123456789);
//        personArr[5] = new Person("John", 44, 123456789);
//        personArr[6] = n

        addDb(personArr, new Person("Ruslan", 29, 123456789));
        addDb(personArr, new Person("Viktor", 29, 123456789));
        addDb(personArr, new Person("Ivan", 29, 123456789));
        addDb(personArr, new Person("Miha", 29, 123456789));
        addDb(personArr, new Person("Dima", 29, 123456789));
        addDb(personArr, new Person("Richard", 33, 123456789));

        if (personArr[0] == personArr[1]) {

        }
        for (int i = 0; i < personArr.length; i++) {
            System.out.println(personArr[i]);
            if (personArr[i] != null){
                personArr[i].say();
            }
        }
    }

    public static Person[] increaseDb(Person[] oldArr){
        Person [] newPersonArr = new Person[oldArr.length+1];
        for (int i = 0; i < oldArr.length; i++) {
            newPersonArr[i] = oldArr[i];
        }
        return newPersonArr;
    }
    public static void addDb(Person[] personArr, Person newPerson){
        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i] == null){
                personArr[i] = newPerson;
                break;
            }
        }
        personArr = increaseDb(personArr);
        personArr[personArr.length - 1] = newPerson;
    }
}
