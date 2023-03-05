package homeworks.additionalHomeWorks.HWLection2.task1;

public class PalindromeDemo {
    public static void main(String[] args) {
        Palindrome word = new Palindrome();

        String[] texts = {"racecar", "level", "sum summus mus", "А роза упала на лапу Азора", "not palInDrOm"};
        for (String text:  texts){
            System.out.println(word.isPalindrome(text));
        }
    }
}
