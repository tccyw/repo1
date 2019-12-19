package chapte7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {
    public static void main(String[] args) {
        String str = "我想求购一本《疯狂JAVA讲义》，近况联系我13912352569" +
                "交朋友电话号码是，18023523523" +
                "出售二手电脑1344324，联系方式是1393111353";
        Matcher m = Pattern.compile("((13\\d)|(18\\d))\\d{8}").matcher(str);

        while (m.find()) {
            System.out.println(m.group());
        }


    }
}
