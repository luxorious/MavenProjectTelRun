package homeworks.SkillDesksHomeWork.homeWork3.task1;

import java.util.ArrayList;
import java.util.Collections;


public class SortArray{
    private final ArrayList<Double>  doubleArr = new ArrayList<>();
    private final ArrayList<String> stringArr = new ArrayList<>();

    UserInput userInput = new UserInput();
    final String[] textArrFromUser = userInput.input().split(" ");


    public void toArray(){
        for (int i = 0; i < textArrFromUser.length; i++) {
            try{
                double number = Double.parseDouble(textArrFromUser[i]);
                this.doubleArr.add(number);
            } catch (NumberFormatException e) {
                this.stringArr.add(textArrFromUser[i]);
            }
        }
    }

    public void sortWords(){
        Collections.sort(this.stringArr);
    }

    public void sortMinNumbersFirst(){
        for (int i = 0; i < this.doubleArr.size(); i++) {
            for (int j = 0; j < this.doubleArr.size(); j++) {
                if (this.doubleArr.get(i) < this.doubleArr.get(j)){
                    double number = this.doubleArr.get(i);
                    this.doubleArr.set(i, this.doubleArr.get(j));
                    this.doubleArr.set(j, number);
                }
            }
        }
    }

    public ArrayList<Double> getDoubleArr() {
        return doubleArr;
    }

    public ArrayList<String> getStringArr() {
        return stringArr;
    }
}