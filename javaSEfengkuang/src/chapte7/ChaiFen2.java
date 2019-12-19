package chapte7;

import javafx.css.Match;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChaiFen2 {
    public static void main(String[] args) {
        String str="A1B2C3D4E5F6G7H8";

        Pattern pattern=Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str);
        int[] arrNum = new int[8];
        int arri=0;
        while (matcher.find()) {

            arrNum[arri++] = Integer.valueOf(matcher.group());
        }
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i]);

        }
        Pattern pattern1=Pattern.compile("\\D");
        Matcher matcher1 = pattern1.matcher(str);
        int arra=0;
        String[] arrStr = new String[8];
        System.out.println(" ");

        while (matcher1.find()) {
            arrStr[arra++] = String.valueOf(matcher1.group());
        }
        for (int i = 0; i < arrStr.length; i++) {
            System.out.print(arrStr[i]);

        }
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrNum));

    }


}
