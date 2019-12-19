package chapte7;

import java.sql.SQLOutput;

public class JieQu {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        String a = str.substring(2, 4);
        String b = str.substring(0, 1) + str.substring(1, 2) + str.substring(5, 6);
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
