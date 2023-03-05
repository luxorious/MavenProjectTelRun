package homeworks.additionalHomeWorks.HWLection1.task1;

import java.util.ArrayList;

public class WordService {
    private String text;

    public WordService(String text) {
        this.text = text;
    }

    public void findMostFrequentWord() {
        String[] words = text.split(" ");
        ArrayList<String> word = new ArrayList<>();
        int counter = 0;
        int wordsCounter = 0;
        String mostOftenWord = "";

        for (int i = 0; i < words.length; i++) {
            wordsCounter = 0;
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equals(words[j])){
                    counter++;
                    if (counter > wordsCounter){
                        wordsCounter++;
                        mostOftenWord = words[i];
                    }
                }
            }
        }
        System.out.println(mostOftenWord);
    }
}

