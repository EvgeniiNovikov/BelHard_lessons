//Задание 22
//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//записаных по правилам Java, с помощью регулярных выражений и вывести их на
//страницу.


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class JavaNumbs
{
    public static void main(String[] args) {
        String s = "0x141D12 , a0X141D1 , wefgerg0x141Dsasdefg";
        Pattern reg = Pattern.compile("0[xX]([0-9A-Fa-f0-9A-Fa-f])*");
        Matcher matcher = reg.matcher(s);
        while (matcher.find()){
            System.out.println(s.substring(matcher.start(), matcher.end()));
        }
    }
}
