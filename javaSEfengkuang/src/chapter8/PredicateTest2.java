package chapter8;


import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("疯狂水电费速度豆腐干豆腐个");
        collection.add("Java水电费速度个");
        collection.add("疯狂水Java教程胜多负少的水电费为");
        collection.add("疯");
        collection.add("C语言程序设水电费计");
        collection.add("C语言程序设疯狂时代大厦速度速度计");
        collection.add("C语言程序设的非官方时代大厦速度速度计");

        System.out.println(calAll(collection, ele -> ((String) ele).contains("疯狂")));

        System.out.println(calAll(collection, ele -> ((String) ele).contains("Java")));
        System.out.println(calAll(collection, ele -> ((String) ele).length()>10));



    }

    public static int calAll(Collection books, Predicate predicate) {
        int total=0;
        for (Object o : books) {
            if (predicate.test(o)) {
                total++;
            }
        }
        return total;
    }
}
