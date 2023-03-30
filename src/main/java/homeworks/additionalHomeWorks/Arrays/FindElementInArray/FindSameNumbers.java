package homeworks.additionalHomeWorks.Arrays.FindElementInArray;

import java.util.ArrayList;
import java.util.Scanner;

public class FindSameNumbers extends CreateArray{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> allIndex = new ArrayList<>();
    int number = random.nextInt(10);
    int [] returnedArray = arr();
    int firstIndex = -1;
    int lastIndex = -1;

    String firstLastElem;
    public int FindFirstElementFromArray(){
//        System.out.println("Input number for search");
//        int number = scanner.nextInt();
        firstLastElem = "First";
        for (int i = 0; i < returnedArray.length; i++) {
            if(number == returnedArray[i]){
                firstIndex = i;
                break;
            }
        }
        System.out.println(notInArray(firstIndex));
        return firstIndex;
    }

    public int FindLastElementFromArray(){
        firstLastElem = "Last";
        for (int i = 0; i < returnedArray.length; i++) {
            if (number == returnedArray[i]){
                lastIndex = i;
            }
        }
        System.out.println(notInArray(lastIndex));
        return lastIndex;
    }

    public ArrayList<Integer> findAllIndexOfElems(){
        for (int i = 0; i < returnedArray.length; i++) {
            if (number == returnedArray[i]){
                allIndex.add(i);
            }
        }
        return allIndex;
    }

    private String notInArray(int index){
        if (index == -1){
            return "Sorry, not found element in Array";
        }
        return firstLastElem + " elem has index:";
    }

    public void changeNumber(int newNumber){
        number = newNumber;
    }

    public boolean FindFirstElementFromArray(int numberForChange){
        for (int i = 0; i < returnedArray.length; i++) {
            if(number == returnedArray[i]){
                returnedArray[i] = numberForChange;
                return true;
            }
        }
        return false;
    }

    public boolean changeAllElems(int newNumber){
        int counter = 0;
        for (int i = 0; i < returnedArray.length; i++) {
            if (returnedArray[i] == number){
                returnedArray[i] = newNumber;
                counter++;
            }
        }
        return counter > 0;
    }


}
