package chapter8;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("围殴但收件方可视对讲开关");
        books.add("水电费玩儿");
        books.add("sdf十多个十多个");
        books.add("的非官方个的地方");
        books.add("的非官方个梵蒂冈梵蒂冈地方而方");
        books.add("的非而方");
        System.out.println(books);
        books.removeIf(ele -> (((String) ele).length() < 10));
        System.out.println(books);
    }
}
