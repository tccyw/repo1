package chapte7;

import java.util.Scanner;

public class NumTest {
    public static void main(String[] args) {
        int[] num = new int[10];
        int max = num[0];
        int min = num[0];
        int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入10个数");

        for (int i = 0; i < num.length; i++) {

            num[i] = in.nextInt();
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }
            sum += num[i];
        }
        System.out.println("max=" + max + ",min=" + min + ",avg=" + sum / 10);
    }
}
