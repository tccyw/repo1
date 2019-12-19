package chapter8;

import java.util.stream.IntStream;

public class IntStreamTest {
    public static void main(String[] args) {
        IntStream is = IntStream.builder().add(10).add(12).add(-2).add(18).build();
//        System.out.println("is所有元素的最大值:" + is.max().getAsInt());
//        System.out.println("is所有元素的最大值:" + is.min().getAsInt());
//        System.out.println(is.sum());

//        System.out.println(is.allMatch(ele->ele*ele>20));
//        System.out.println(is.anyMatch(ele->ele*ele>20));

        IntStream newIs = is.map(ele -> ele * 2 + 1);
        newIs.forEach(e-> System.out.println(e));

    }

}
