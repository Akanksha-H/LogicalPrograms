package logicalprogram;

import java.util.GregorianCalendar;

public class JUnitTestingProgram {
    public static void main(String[] args) {
       dayOfAWeek();
    }
    static void dayOfAWeek() {
        int y = 0;
        int m = 0;
        int d = 0;
        GregorianCalendar calendar = new GregorianCalendar(y, m, d);

        System.out.println("Day of Week = " + calendar.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("Date = " + calendar.get(GregorianCalendar.DATE));
        System.out.println("Month = " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Year = " + calendar.get(GregorianCalendar.YEAR));
    }
}
