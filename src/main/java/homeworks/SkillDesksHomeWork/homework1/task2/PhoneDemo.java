package homeworks.SkillDesksHomeWork.homework1.task2;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone iphone = new Phone(12_345_678_543L, "iPhone 12", 150);
        Phone samsung = new Phone(12_321_213_212L, "Galaxy S22 ultra", 180);
        Phone xiaomi = new Phone(32_414_542_345L, "mi 12", 140);

        iphone.receiveCall("John");
        System.out.println(iphone.getModel());
        System.out.println(iphone.getNumber());
        System.out.println(iphone.getWeight());
        System.out.println();

        samsung.receiveCall("Ivan");
        System.out.println(samsung.getModel());
        System.out.println(samsung.getNumber());
        System.out.println(samsung.getWeight());
        System.out.println();

        xiaomi.receiveCall("Harry");
        System.out.println(xiaomi.getModel());
        System.out.println(xiaomi.getNumber());
        System.out.println(xiaomi.getWeight());
        System.out.println();
    }
}
