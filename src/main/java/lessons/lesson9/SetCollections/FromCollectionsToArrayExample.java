package lessons.lesson9.SetCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FromCollectionsToArrayExample {
    public static void main(String[] args) {
        String[] stringArr = new String[7];


        stringArr[0] = "January";
        stringArr[1] = "February";
        stringArr[2] = "March";
        stringArr[3] = "April";
        stringArr[4] = "May";
        stringArr[5] = "June";
        stringArr[6] = "Januarry";
//        stringArr[7] = "January";



        System.out.println("__________________________________________________");

        System.out.println(convertArrayToSet(stringArr));
        System.out.println(convertArrayToSetWithArraysMethod(stringArr));
        System.out.println(convertArrayToSetWithCollectionsMethod(stringArr));
        System.out.println(convertArrayToSetWithSetMethod(stringArr));
        System.out.println(convertArrayToSetWithSetMethod(stringArr));

        System.out.println("__________________________________________________");

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();
        Set<String> set4 = new HashSet<>();
        Set<String> set5 = new HashSet<>();

        set1 = convertArrayToSet(stringArr);
        set2 = convertArrayToSetWithArraysMethod(stringArr);
        set3 = convertArrayToSetWithCollectionsMethod(stringArr);
        set4 = convertArrayToSetWithSetMethod(stringArr);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
        System.out.println(set4);
        System.out.println("__________________________________________________");


        for (String str:set3){
            System.out.println(str);
        }


    }

    public static Set<String> convertArrayToSet(String[] workingArray){
        Set<String> setForReturn = new HashSet<>();

        for (int i = 0; i < workingArray.length; i++) {
            setForReturn.add(workingArray[i]);
        }

        return setForReturn;
    }

    public static Set<String> convertArrayToSetWithArraysMethod(String[] workingArray){
        Set<String> setForReturn = new HashSet<>(Arrays.asList(workingArray));

        return setForReturn;
    }

    public static Set<String> convertArrayToSetWithCollectionsMethod(String[] workingArray){

        Set<String> setForReturn = new HashSet<>();

        Collections.addAll(setForReturn, Arrays.toString(workingArray));
        return setForReturn;
    }

    public static Set<String> convertArrayToSetWithSetMethod(String[] workingArray){

        Set<String> setForReturn = new HashSet<>(Set.of(workingArray));

        return setForReturn;
    }


}
