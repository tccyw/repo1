package chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectioniTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("孙悟空");
        c.add(7);
        System.out.println("c及合理的元素" + c.size());
        c.remove(7);

        c.add(9);
        System.out.println("c集合里的元素" + c.size());
        System.out.println("c集合里是否包含\"孙悟空\"字符串：" + c.contains("孙悟空"));
        c.add("轻量级JAVAEE企业");
        System.out.println("c集合的元素" + c);


        Collection books = new HashSet();
        books.add("轻量级JAVAEE企业");
        books.add("疯狂Java讲义");
        System.out.println("c是否完全包含？：" + c.containsAll(books));
        System.out.println("c是否包含？：" + c.contains(books));

//        c.removeAll(books);
        System.out.println("c集合里的元素" + c);

        c.clear();

        System.out.println("c集合里的远古三" + c);
        System.out.println(books);

        books.retainAll(c);
        System.out.println("book集合" + books.retainAll(c));


    }
}
