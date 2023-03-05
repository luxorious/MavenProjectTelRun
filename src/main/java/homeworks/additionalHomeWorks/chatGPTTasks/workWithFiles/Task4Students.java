package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4Students {
    private static Map<String, Double> students = new HashMap<>();
//    Напишіть програму, яка зчитує з файлу список студентів та їх оцінки
//    і виводить на екран середній бал кожного студента.
    public static void main(String[] args) {
        try {
            openFile();
        } catch (IOException e){
            System.out.println("exception");
        }
    }
    private static void openFile()throws IOException {
        String path = "src/homeworks/additionalHomeWorks/chatGPTTasks/workWithFiles/sources/students.txt";
        FileReader fr = new FileReader(path);
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();

        while (line != null){
            System.out.println(line);
            List<String> arrayLine = List.of(line.split(" "));
            addToMap(arrayLine);
            line = reader.readLine();
        }
        reader.close();
        fr.close();
    }
    private static void addToMap(List<String> line){
        Integer middleArithmetic = 0;
        for (int i = 1; i < line.size(); i++) {
            String li = (line.get(i).replaceAll("[^0-9]+", ""));
            middleArithmetic += Integer.parseInt(li);
            System.out.println(middleArithmetic);
        }

        double value = (double) middleArithmetic/(line.size()-1);
        students.put(line.get(0), value);
        System.out.println(students);
    }

}
