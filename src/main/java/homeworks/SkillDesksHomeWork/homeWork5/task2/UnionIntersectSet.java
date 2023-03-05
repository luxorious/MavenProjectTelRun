package homeworks.SkillDesksHomeWork.homeWork5.task2;

import java.util.Set;
import java.util.TreeSet;

public class UnionIntersectSet {
//    Напишите методы union(Set<?>... set) и intersect(Set<?> ... set),
//    реализующих операции объединения и пересечения множеств.

    public <T> Set<T> union(Set<T>... sets){
        Set<T> unionSet = new TreeSet<>();
        for (Set<T> set: sets){
            unionSet.addAll(set);
        }
        return unionSet;
    }

    public <T> Set <T> intersect(Set<T>... sets){
        Set<T> intersectSet = new TreeSet<>(sets[0]);

        for (int i = 1; i < sets.length; i++) {
            intersectSet.retainAll(sets[i]);
        }
        return intersectSet;
    }
}
