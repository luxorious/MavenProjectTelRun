package lessons.lesson19.generics;

public class GenericExample5 {
    static class OnlyNumbers<T extends Number>{
        private T number;

        public OnlyNumbers(T number){
            this.number = number;
//            print();  // ніколи  не можна викликати якісь методи у конструкторі!!!!!
        }

        public void print(){
            System.out.println(number);
        }

        public static void main(String[] args) {
            OnlyNumbers<Integer> numbers = new OnlyNumbers<>(1);
            OnlyNumbers<Long> numbers1 = new OnlyNumbers<>(123L);
            OnlyNumbers<Double> numbers2 = new OnlyNumbers<>(1.1);
//            OnlyNumbers<String> numbers3 = new OnlyNumbers<>("sdfgh");
        }
    }
}
