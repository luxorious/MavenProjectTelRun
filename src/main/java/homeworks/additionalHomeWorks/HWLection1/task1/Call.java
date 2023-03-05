package homeworks.additionalHomeWorks.HWLection1.task1;

public class Call {
    public static void main(String[] args) {
        String text = "abc de df fr abc fr de abc fr";
        WordService word = new WordService(text);
        word.findMostFrequentWord();
    }
}
