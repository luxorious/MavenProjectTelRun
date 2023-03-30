package lessons.lesson15.lambdaExample;

public class lambdaExample {
    @FunctionalInterface
    interface OurInterface{
        String reverse(String str);
    }

    public static void main(String[] args) {
        OurInterface ourInterface = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i>=  0; i--){
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("string reverse = " + ourInterface.reverse("Lambda"));
    }

}
