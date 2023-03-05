package homeworks.additionalHomeWorks.HWlesson6.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWordFinder {
    public Set<String> find(String text){
        text = text.replaceAll("[^A-Za-zА-Яа-я0-9 ]", "");
        List<String> list = List.of(text.split(" "));
        return new HashSet<>(list);
    }
}
