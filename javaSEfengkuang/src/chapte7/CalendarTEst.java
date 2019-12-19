package chapte7;

import java.util.Calendar;

public class CalendarTEst {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));

        c.set(2003, Calendar.OCTOBER, 23, 12, 32, 23);
        c.add(Calendar.YEAR, -1);
        c.roll(Calendar.MONTH, -8);

        System.out.println(c.getTime());

    }
}
