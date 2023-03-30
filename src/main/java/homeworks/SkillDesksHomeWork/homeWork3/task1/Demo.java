package homeworks.SkillDesksHomeWork.homeWork3.task1;

public class Demo {
    public static void main(String[] args) {
        SortArray toArr = new SortArray();

        toArr.toArray();
        toArr.sortMinNumbersFirst();
        System.out.println(toArr.getDoubleArr());

        System.out.println(toArr.getStringArr());
        toArr.sortWords();
        System.out.println(toArr.getStringArr());
    }
}
