package homeworks.additionalHomeWorks.Arrays.FindElementInArray;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        FindSameNumbers same = new FindSameNumbers();


        same.changeNumber(1);
        same.arr();
        System.out.println(same.FindFirstElementFromArray());
        System.out.println(same.FindLastElementFromArray());
        System.out.println("All indexes in array" + same.findAllIndexOfElems());
        System.out.println("Number " + same.number + " in array we can see " +
                same.allIndex.size() + " times.");


        System.out.println(same.FindFirstElementFromArray(5));
        System.out.println(same.changeAllElems(4));

    }
}
