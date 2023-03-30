package lessons.lesson19;

public class TryCatchExample {
    public static void main(String[] args) {
        try{
            System.out.println("1");
            System.out.println("2");
            System.out.println("4");
            System.out.println("1234567890-98765432");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
        } catch (ProductValidationException e){
            System.out.println("Validation failed, reason " + e.getMessage());
//            e.printStackTrace();
//            illegalArgumentException();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }

    }

    static void illegalArgumentException(){throw new IllegalArgumentException("RandomError");}

    static void validateProductName(String name){
        if (name.length() < 10){
            throw new ProductValidationException("Product name should be greater then 10 symbols");
        }
    }
}
