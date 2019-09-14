//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//абзацев <p>.



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceTags
{
    public static void main(String[] args) {
        String text = "<p id=\"p1\"> * Tags Replacement * </p>";
        Pattern reg = Pattern.compile("<p.*?>|<p>");
        Matcher matcher = reg.matcher(text);
        System.out.println(matcher.replaceAll("<p>"));
    }

}
