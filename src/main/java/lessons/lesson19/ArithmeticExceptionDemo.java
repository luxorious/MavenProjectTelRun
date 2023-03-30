package lessons.lesson19;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try{
            int x = 0;
            int y = 10;
            int z = y/x;
        } catch (ArithmeticException e){
            System.out.println("Zero Division Exception");
        }

    }
}
