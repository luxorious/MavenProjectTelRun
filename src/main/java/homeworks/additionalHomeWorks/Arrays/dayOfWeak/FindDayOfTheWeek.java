//как лучше писать код, каждый метод поместить в отдельный класс или пытаться писать методы в одном классе?
package homeworks.additionalHomeWorks.Arrays.dayOfWeak;

public class FindDayOfTheWeek extends DayOfTheWeekDetector{
    public String findWeekDay(int dayNumber){
        switch (dayNumber){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Wrong day number";
        }
    }
}
