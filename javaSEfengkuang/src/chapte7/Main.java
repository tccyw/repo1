package chapte7;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("java");

        sb.insert(0, "hello ");
        String s="adb";

        StringBuilder sb1 = new StringBuilder();
        sb1.insert(0,"hello");
        String p = new String(sb1);
        p.toUpperCase();
        System.out.println("大写的:" + p.substring(0,1).toUpperCase()+p.substring(1,4)+p.substring(4,5).toUpperCase());

        StringBuilder sb2 = new StringBuilder();
        sb2.append(p.substring(0, 1).toUpperCase() + p.substring(1, 4) + p.substring(4, 5).toUpperCase());
        sb2.reverse();
        System.out.println(sb2);

    }
}
