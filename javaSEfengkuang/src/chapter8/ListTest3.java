package chapter8;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
    public static void main(String[] args) {

        List books = new ArrayList();
        books.add(new String("轻量级java ee企业应用实战"));
        books.add("疯狂java讲义");
        books.add("疯狂android讲义");
        books.add("疯狂ios讲义");
        books.sort(((o1, o2) -> ((String) o1).length() - ((String) o2).length()));
        System.out.println(books);
        books.replaceAll(ele -> ((String) ele).length());
        System.out.println(books);

    }
}
