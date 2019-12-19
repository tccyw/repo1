package chapter8;

import java.util.HashMap;

public class mapKeyTest {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "b", "c",     "a", "b", "c", "b", "c"};
        HashMap<String,Integer> hashMap = new HashMap();
        for (String str : arr) {
            if (hashMap.containsKey(str)) {
                hashMap.put(str, hashMap.get(str) + 1);
            } else {
                hashMap.put(str, 1);
            }
        }
        System.out.println(hashMap);
    }

}
