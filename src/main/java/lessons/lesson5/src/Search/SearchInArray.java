package lessons.lesson5.src.Search;

import java.util.Arrays;
import java.util.Random;

public class SearchInArray {
    public static void main(String[] args) {
        SearchInArray searchInArray = new SearchInArray();

        int[] workingArray = searchInArray.createArray();

        int[] sortedArray = searchInArray.sortedArray(workingArray);
        int element = 11;

        System.out.println(Arrays.toString(workingArray));

        int index = searchInArray.searchIndex(workingArray, element);

        System.out.println(Arrays.toString(sortedArray));

    }
    public int[] createArray(){
        int [] workingArray = {6, 3, 5, 12, 44, 25, 11, 645, 112, 32 ,64};
        Random random = new Random();
        int sizeArr = random.nextInt(20);
//        int[] workingArray = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            workingArray[i] = random.nextInt(25);
        }
        return workingArray;
    }

    public int[] sortedArray(int[] workingArray){
        int[] sortedArray = new int[workingArray.length];
        System.arraycopy(workingArray, 0, sortedArray, 0 ,workingArray.length);
        Arrays.sort(sortedArray);

        return sortedArray;
    }
    public int searchIndex(int[] arrayForSearch, int elementForSearch){
        int index = -1;
        for (int i = 0; i < arrayForSearch.length; i++) {
            if(arrayForSearch[i] == elementForSearch){
                index = i;
                break;
            }
        }
        return index;
    }
}
