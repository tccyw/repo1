package chapter8;

import java.util.HashSet;
import java.util.Scanner;

public class SetDeTest {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        int sum=10;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sum; i++) {
//            set.add(scanner);
            String a = scanner.nextLine();
            set.add(a);
        }
        System.out.println(set);

    }

}
