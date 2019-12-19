package chapte7;

import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        boolean b = m.matches();

        System.out.println(b);

        boolean b2 = Pattern.matches("a*b", "aaaab");
        System.out.println("b2="+b2);
        Matcher m2 = p.matcher("aaaab");

        System.out.println("m2.find" + m2.find());
        System.out.println("m2.group" + m2.group());
        System.out.println("m2.start" + m2.start());
        System.out.println("m2.end" + m2.end());


    }
}
