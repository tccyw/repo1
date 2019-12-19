package chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("《新白娘子传奇》");
        c.add("《悟空传》");
        c.add("《白蛇传》");
        Iterator it = c.iterator();
        while (it.hasNext()) {
            String book = (String) it.next();
            System.out.println(book);

            if (book.equals("《新白娘子传奇》")) {
//                it.remove();
//                c.remove("《新白娘子传奇》");
            }
            book = "测试";
        }
        System.out.println(c);

    }
}
