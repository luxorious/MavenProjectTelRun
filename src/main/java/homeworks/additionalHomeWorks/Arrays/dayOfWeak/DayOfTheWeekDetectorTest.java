package homeworks.additionalHomeWorks.Arrays.dayOfWeak;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
//        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();//how test file with scanner?
        FindDayOfTheWeek find = new FindDayOfTheWeek();
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        String[] days = {"not a day", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Not a day"};
        int[] daysArr = new int[9];
        for (int i = 0; i < daysArr.length; i++) {
            daysArr[i] = i;
            test.checkResult(find.findWeekDay(daysArr[i]).equals(days[i]), days[i]);
        }
    }

    private void checkResult(boolean coincidence, String dayName){
        if (coincidence){
            System.out.println(dayName + " = ok!");
        } else {
            System.out.println(dayName + " = fail!");
        }
    }
}
