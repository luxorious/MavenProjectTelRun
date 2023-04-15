package homeworks.additionalHomeWorks.multithreading.textWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;

public class TextWriter {
    //    4. Написать метод, в котором 3 потока построчно пишут данные в файл (штук по 10 записей, с периодом в 20 мс)
    public synchronized void write() {
        long startTime = System.nanoTime();
        String filePath = "src/main/java/homeworks/additionalHomeWorks/multithreading/textWriter/example.txt";
        String threadName = Thread.currentThread().getName();
        try (FileWriter appender = new FileWriter(filePath, true)) {
            for (int i = 0; i < 10; i++) {
                String textForAppend = Instant.now() + " - the current time in moment appending " +
                        ", and current Thread - " + threadName + "\n";
                appender.append(textForAppend);
                sleep();
            }
            System.out.println("Data appended to file, you can check it by path: " + filePath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void sleep() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
