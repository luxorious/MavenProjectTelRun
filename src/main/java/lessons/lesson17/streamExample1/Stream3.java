package lessons.lesson17.streamExample1;



import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {
        List<String> names = List.of("Ruslan", "Max", "Viktor", "Iana", "Vlad", "Patrick", "Petro", "");

        System.out.println(names);
        List<String> names2 = names.stream()
//                .filter(name -> StringUtils.isNotBlank(name))
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(names2);

        names2.clear();

        for(String name : names){
            if (!name.isBlank()){
                names2.add(name.toUpperCase());
            }
        }
        System.out.println(names2);

        long numberOfNames = names.stream()
                .filter(name -> !name.isBlank())
                .filter(name -> name.startsWith("P"))
                .count();

        System.out.println("Numbers of names - " + numberOfNames);

        List<String> namesP = names.stream()
                .filter(name -> !name.isBlank())
                .filter(name -> name.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println("Number Of nums - " + namesP.size());
    }
}
