package lessons.lesson19;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            throwCheckedException();
            System.out.println("---------");
            throwUncheckedException();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void throwCheckedException() throws Exception {
        throw new Exception("Checked Exception");
    }

    static void throwUncheckedException() throws Exception {
        throw new RuntimeException("unchecked Exception");
    }
}
