package lessons.lesson20.lessonCode;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        RegWeb rw = new RegWeb();
        List links = rw.getLinks("https://www.dfg.de/");
        System.out.println(links);
    }
}
