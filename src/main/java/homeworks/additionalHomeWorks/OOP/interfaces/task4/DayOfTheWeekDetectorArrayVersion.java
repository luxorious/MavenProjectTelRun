package homeworks.additionalHomeWorks.OOP.interfaces.task4;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{

    @Override
    public String detectDayName(int number) {
        if (number < 0 || number > 7){
            return "Wrong Days Number!";
        }
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return daysOfWeek[number-1];
    }
}
