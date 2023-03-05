package lessons.lesson19.generics;

public class Generic4 {
    static class TestW<T, U> {
        T obj;
        U obj1;

        public TestW(T obj, U obj1) {
            this.obj = obj;
            this.obj1 = obj1;
        }

        public T getObj() {
            return obj;
        }

        public U getObj1() {
            return obj1;
        }

    }
    public static void main(String[] args) {
        TestW<Integer, String> test1 = new TestW<>(15, "Generic");
        System.out.println(test1.getObj());

//        TestW<String> test2 = new TestW<>("Generics");
//        System.out.println(test2.getObj());
    }
}
