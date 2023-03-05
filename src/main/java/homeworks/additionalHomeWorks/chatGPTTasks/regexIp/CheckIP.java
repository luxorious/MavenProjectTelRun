package homeworks.additionalHomeWorks.chatGPTTasks.regexIp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIP {
    public boolean isValid(String ip){
        String regex = "\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);
        if (matcher.find()){
            return true;
        }
        return false;
    }
}
