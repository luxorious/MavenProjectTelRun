package lessons.lesson20.lessonCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegWeb {
    private Pattern htmlTag;
    private Pattern link;

    public RegWeb() {
        htmlTag = Pattern.compile("<a\\b[^>]*href=\"[^>]*(.*?)");
        link = Pattern.compile("href=\"[^>]*\">");
    }

    public List getLinks(String url){
        List links = new ArrayList<>();

        try{
            BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(new URL(url).openStream())));
            String str;
            StringBuilder builder = new StringBuilder();
            while ((str= bufferedReader.readLine()) != null){
                builder.append(str);
            }

            Matcher tagMatcher = htmlTag.matcher(builder.toString());

            while (tagMatcher.find()){
                Matcher matcher = link.matcher(tagMatcher.group());
                matcher.find();
                String link = matcher.group().replaceFirst("href=\"", "")
                        .replaceFirst("\">", "")
                        .replaceFirst("\"[\\s]?target=\"[a-zA-Z_0-9]*", "");
            }
            if (valid(String.valueOf(link))){
                links.add(link);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return links;
    }

    private boolean valid(String str){
        if (str.matches("javascript")){
            return false;
        }
        return true;
    }

}
