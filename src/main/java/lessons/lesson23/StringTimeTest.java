package lessons.lesson23;

public class StringTimeTest {
    public static void main(String[] args) {
        String str = "";

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            str = str +  i;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("time operations - " + (endTime - startTime) + " time start - " +
                startTime + " end time " + endTime);

        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("time operations - " + (endTime - startTime));

        StringBuffer sbuf = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            sbuf.append(i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("time operations - " + (endTime - startTime));
    }
}
