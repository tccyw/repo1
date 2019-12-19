package chapter8;

import java.util.Collection;
import java.util.HashSet;

public class CollectionSream {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("疯狂水电费为第三方郭德纲");
        c.add("十多个地方费为第三方郭德纲");
        c.add("电饭锅疯狂的第三方郭德纲");
        c.add("让它发挥疯狂看地图你三方郭德纲");
        c.add("让它发挥疯狂看地图你三方郭德纲");
        c.add("电饭锅第三方郭德纲");
        c.add("疯千万人员为第三方郭德纲");
        c.add("疯");
        c.add("疯");
        System.out.println(c.stream().filter(ele -> ((String) ele).contains("疯狂")).count());
        System.out.println(c.stream().filter(ele -> ((String) ele).contains("郭德纲")).count());
        System.out.println("==================");
        System.out.println(c.stream().filter(ele -> ((String) ele).length() > 10).count());
        System.out.println("==================");

        c.stream().mapToInt(ele -> ((String) ele).length()).forEach(System.out::println);

    }
}
