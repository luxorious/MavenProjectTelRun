package lessons.lesson23;

import java.util.Arrays;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append(new Integer(25));
        sb.append(";");

        sb.append(true);
        sb.append(",");
        sb.append(Arrays.asList(1,2,3,4,5));
        sb.append("!");

        System.out.println(sb);
    }
}
