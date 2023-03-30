package lessons.lesson15.lambdaExample;



public class lambdaExample2 {
    @FunctionalInterface
    interface OurSuperInterface<T>{
        T function(T t);
    }

    public static void main(String[] args) {
        OurSuperInterface<String> ourInterface = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("string reverse = " + ourInterface.function("Lambda"));


        OurSuperInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Factorial - " + factorial.function(5));
    }



}

