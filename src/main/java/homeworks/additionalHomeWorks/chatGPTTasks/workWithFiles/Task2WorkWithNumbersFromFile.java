package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Task2WorkWithNumbersFromFile {
//    ️✔ Напишіть програму, яка зчитує з файлу список чисел та знаходить їх суму.
    public static void openFile() throws IOException {
        File filePath = new File("src/homeworks/additionalHomeWorks/chatGPTTasks/workWithFiles/sources/numbers.txt");
        FileReader fr = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fr);

        String textLine = reader.readLine().replaceAll("[^0-9]", ",");
        int sumOfAllNumbers = 0;
        while (textLine != null){
            System.out.println(textLine);
            List<String> listOfWordsFromTxtFile = List.of(textLine);
            System.out.println(listOfWordsFromTxtFile);
            int sumOfNumbers = listOfWordsFromTxtFile.stream()
                    .flatMap(s -> Arrays.stream(s.split(",")))
                    .filter(n -> {
                        try {
                            Integer.parseInt(n);
                            return true;
                        } catch (Exception e) {
                            return false;
                        }
                    })
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
            sumOfAllNumbers += sumOfNumbers;
            textLine = reader.readLine();
        }
        fr.close();
        reader.close();
        System.out.println(sumOfAllNumbers);
    }

    public static void main(String[] args) {
        try {
            openFile();
        } catch (IOException e){
            System.out.println();
        }
    }
}
