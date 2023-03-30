package homeworks.additionalHomeWorks.HWLection2.task1;

public class Palindrome {
    //цикл фор додати з кінця в список і потім зрівняти спліт список і той
    public boolean isPalindrome(String text){
        String tex = text.replaceAll(" ","");
        String[] words = tex.toLowerCase().split("");

        int len = words.length - 1;
        for(int i = 0; i < words.length; i++, len--) {
            if (words[len].equals(words[i])){
                ;
            } else {
                return false;
            }
        }
        return true;
    }
}