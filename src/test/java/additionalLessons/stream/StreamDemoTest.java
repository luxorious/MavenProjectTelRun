package additionalLessons.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamDemoTest {

    @Test
    void divider1(){
        List<Integer> list = new ArrayList<>(List.of(2, 5, 3, 4, 5, 5, 7, 3, 10, 2));
        Integer expected = 1;
        Integer actual = StreamDemo.task3(list);

        assertEquals(expected, actual);
    }

    @Test
    void divider2(){
        List<Integer> list = new ArrayList<>(List.of(4, 4, 6, 8));
        Integer expected = 2;
        Integer actual = StreamDemo.task3(list);

        assertEquals(expected, actual);
    }

    @Test
    void divider3(){
        List<Integer> list = new ArrayList<>(List.of(15, 6, 9, 12));
        Integer expected = 3;
        Integer actual = StreamDemo.task3(list);

        assertEquals(expected, actual);
    }
}