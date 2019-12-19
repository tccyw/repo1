package chapter8;

import java.util.ArrayList;
import java.util.List;

public class listTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1324");
        list.add("aab");
        list.add("山东人");
        list.add("tessa");
        list.add("全球购");
        list.add("共同体");
        list.add("全球购");
        list.add("公司的");
        list.add("耳机");
        list.add("归属权");
        list.add("工商局");
        System.out.println("list.get(5)" + list.get(5));
        System.out.println("list.indexOf(\"全球购\")" + list.indexOf("全球购"));
        System.out.println("list.indexOf(\"全球购\")" + list.indexOf("全球购"));
        System.out.println("list.indexOf(\"公司的\")" + list.indexOf("公司的"));
        list.remove(3);
        System.out.println(list);


    }
}
