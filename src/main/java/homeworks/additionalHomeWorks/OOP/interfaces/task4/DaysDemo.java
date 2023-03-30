package homeworks.additionalHomeWorks.OOP.interfaces.task4;

import java.util.Scanner;

public class DaysDemo {
    private DayOfTheWeekDetector DayDetector;
    Scanner scanner = new Scanner(System.in);

    public DaysDemo(DayOfTheWeekDetector dayDetector) {
        this.DayDetector = dayDetector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorArrayVersion arr = new DayOfTheWeekDetectorArrayVersion();

        DayOfTheWeekDetectorIfVersion iff = new DayOfTheWeekDetectorIfVersion();

        DayOfTheWeekDetectorSwitchVersion switchD = new DayOfTheWeekDetectorSwitchVersion();


        System.out.println(arr.detectDayName(1));
        System.out.println(iff.detectDayName(1));
        System.out.println(switchD.detectDayName(1));

        DaysDemo findDaySwitch = new DaysDemo(new DayOfTheWeekDetectorSwitchVersion());
        DaysDemo findDayIf = new DaysDemo(new DayOfTheWeekDetectorIfVersion());
        DaysDemo findDayArr = new DaysDemo(new DayOfTheWeekDetectorArrayVersion());

        findDaySwitch.run();
        findDayIf.run();
        findDayArr.run();
    }

    public void run(){
        System.out.print("input days number: ");
        int numberOfDay = scanner.nextInt();
        System.out.println(this.DayDetector.detectDayName(numberOfDay));
    }
//    Создайте класс DayOfTheWeekDetectorDemo.
//
//    Цель этой программы:
//            - запросить у пользователя число;
//- с помощью одной из имплементаций интерфейса DayOfTheWeekDetector найти название дня недели;
//- вывести на консоль найденное название.
//
//    В классе DayOfTheWeekDetectorDemo создайте конструктор класса, который принимает один параметр
//    типа DayOfTheWeekDetector (интерфейс). Через этот конструктор в класс будет подаваться
//    имплементация интерфейса, которую программа должна использовать для нахождения названия
//    дня недели. Сохраните переданную инстанцию DayOfTheWeekDetector в свойство класса для того,
//    чтобы использовать её в дальнейшем.
//
//    В классе DayOfTheWeekDetectorDemo создайте метод void run() в котором реализуйте саму программу.
//
//    Теперь при создании экземпляра класса DayOfTheWeekDetectorDemo ему в конструктор можно подать любую
//    из трёх имплементаций интерфейса.
//
//    Создайте в классе DayOfTheWeekDetectorDemo метод main() в котором продемонстрируйте создание и использование
//    экземпляра класса DayOfTheWeekDetectorDemo с разными алгоритмами нахождения названия дня недели.
//
//    Убедитесь, что в не зависимости от того, какая реализация алгоритма используется для определения
//    названия дня недели, программа DayOfTheWeekDetectorDemo работает одинаково.
}
