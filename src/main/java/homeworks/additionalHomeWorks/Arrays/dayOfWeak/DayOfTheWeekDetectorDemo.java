package homeworks.additionalHomeWorks.Arrays.dayOfWeak;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        FindDayOfTheWeek find = new FindDayOfTheWeek();

        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = find.findWeekDay(dayNumber);

        System.out.println(dayOfTheWeek);
    }
}
