package lessons.lesson19.generics;

public class Generic3 {
    static class Test<T> {
        T obj;

        public Test(T obj) {
            this.obj = obj;
        }

        public T getObj() {
            return obj;
        }
    }
    public static void main(String[] args) {
        Test<Integer> test1 = new Test<>(15);
        System.out.println(test1.getObj());

        Test<String> test2 = new Test<>("Generics");
        System.out.println(test2.getObj());
    }
}
