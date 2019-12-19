package chapte7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    public static void main(String[] args) {
        String regStr = "Java is very eays";
        System.out.println("目标字符串是：" + regStr);
        Matcher m = Pattern.compile("\\w+").matcher(regStr);
        while (m.find()) {
            System.out.println(m.group() + "子串的起始位置：" +
                    m.start() + ",结束位置："+m.end());
        }
    }
}
