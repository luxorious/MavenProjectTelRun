package lessons.lesson1.src.Phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone iphone = new Phone("iPhone 13", "Black");
        Phone samsung = new Phone("Note 20 Ultra", "white");
        MyPhone myPhone = new MyPhone(123456, iphone);
        MyPhone herPhone = new MyPhone(123454532, iphone);

        ImportPhone importPhone1 = new ImportPhone("Apple", iphone);
        ImportPhone importPhone2 = new ImportPhone("Samsung", samsung);

        System.out.println(importPhone1);

        MyPhone myPersonalPhone = new MyPhone(123456789, iphone);

        System.out.println(myPersonalPhone);
        myPersonalPhone.ring(93799992);

//        myPhone
        System.out.println(myPhone);
        System.out.println(herPhone);

//        myPersonalPhone.phone.getColor() = "Grey";



    }
}
