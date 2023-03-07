package lessons.lesson22.lessoncode;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 1);
        Car car2 = car1;
        Car car3 = new Car("BMW", 2);



        if (car1.equals(car2)){
            System.out.println("Car1 is equal = Car2");
        }
        if (car3.equals(car1)){
            System.out.println("Car3 is equal = Car2");
        }

        System.out.println("car1 hash code " + car1.hashCode());
        System.out.println("car2 hash code " + car2.hashCode());
        System.out.println("car3 hash code " + car3.hashCode());
    }
}
