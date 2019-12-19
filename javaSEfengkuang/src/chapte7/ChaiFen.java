package chapte7;

public class ChaiFen {


    public static void main(String[] args) {
        String str="A1B2C3D4E5F6G7H8";
        char[] a = str.toCharArray();
        int[] arrint = new int[8];
        String[] arrstr = new String[8];
        int t=0;
        int r=0;
        for (int i = 0; i < str.length(); i++) {

            if (a[i] <= 'Z' && a[i] >= 'A') {
                arrstr[t] = String.valueOf(a[i]);
                t++;
            } else {
                arrint[r] = Integer.valueOf(a[i]);
                r++;
            }

        }
        for (int i = 0; i < arrstr.length; i++) {
            System.out.println(arrstr[i]);
        }
        for (int i = 0; i < arrint.length; i++) {
            System.out.println(arrint[i]);

        }
    }
}
