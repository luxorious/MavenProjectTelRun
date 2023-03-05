package homeworks.SkillDesksHomeWork.homeWork5.task2;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UnionIntersectSetTest {

    public static void main(String[] args) {
        UnionIntersectSet uis = new UnionIntersectSet();

        String[] strArr = {"one", "two", "three", "four", "five","ten"};
        String[] strArr2 = {"six", "seven", "ten"};
        String[] strArr3 = {"eight", "nine", "ten"};

        Set<String> strSet1 = new TreeSet<>(List.of(strArr));
        Set<String> strSet2 = new TreeSet<>(List.of(strArr2));
        Set<String> strSet3 = new TreeSet<>(List.of(strArr3));

        Set<String> unionSetResult = uis.union(strSet1, strSet2, strSet3);

        String[] expectedArr = {"eight","five","four","nine","one","seven","six","ten","three","two"};
        Set<String> expectedUnionSets = new TreeSet<>(List.of(expectedArr));

        if (expectedUnionSets.equals(unionSetResult)){
            System.out.println("Union Sets - works");
        } else {
            System.out.println("union Sets - does not work! expected result " + expectedUnionSets +
                    " but result - " + unionSetResult);
        }
/* __________________________________________________________________________________________________________________ */
        Set<String> expectedIntersectSet = new TreeSet<>();
        Set<String> intersectSetResult = uis.intersect(strSet1, strSet2, strSet3);

        expectedIntersectSet.add("ten");

        if (intersectSetResult.equals(expectedIntersectSet)){
            System.out.println("intersect Sets - works");
        } else {
            System.out.println("intersect Sets - does not work! expected result " + expectedIntersectSet +
                    " but result - " + intersectSetResult);
        }
    }
}