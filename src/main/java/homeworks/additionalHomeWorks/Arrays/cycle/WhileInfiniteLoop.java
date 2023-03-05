package homeworks.additionalHomeWorks.Arrays.cycle;
//Создайте класс WhileInfiniteLoop и в нём напишите бесконечный
//        цикл при помощи цикла while.
public class WhileInfiniteLoop {
    public static void main(String[] args) {
        int l = 0;
        while (true){
            // for stop need press "fn + command + f2"
            System.out.println("Am moving to plus infinity " + l++);
            if(l > 10){
                System.out.println("oops");
                break;
            }
        }
    }
}
