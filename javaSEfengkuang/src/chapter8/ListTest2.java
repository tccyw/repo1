package chapter8;

import java.util.ArrayList;
import java.util.List;

class A{
//    public boolean equals(Object object) {
//        return false;
//
//    }
}



public class ListTest2 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("轻量级JavaEE讲义应用实战"));

        books.add("疯狂java讲义");
        books.add("疯狂Android讲义");
        System.out.println(books
        );

        books.remove(new A());
        System.out.println(books);
        books.remove(new A());
        System.out.println(books);

    }
}
