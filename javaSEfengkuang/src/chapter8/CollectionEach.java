package chapter8;


import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {

    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("似懂非懂是");
        books.add("时光我二十多");
        books.add("土卫二我多");
        books.forEach(obj1 -> System.out.println("迭代集合元素:" + obj1));

    }

}
