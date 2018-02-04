package test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by luosan on 2016/12/18.
 */
public class calendarTest {

    public static void main(String[] args) {
        System.out.println((getLastDayOfMonth(2014,0)));
    }
    public static String getLastDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DATE));
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return  new   SimpleDateFormat( "yyyy-MM-dd").format(cal.getTime());
    }
    public static String getFirstDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH,cal.getMinimum(Calendar.DATE));
        return   new SimpleDateFormat( "yyyy-MM-dd ").format(cal.getTime());
    }
    public static Date getFirstDayOfMonth(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        if (year == null) {
            year = calendar.get(Calendar.YEAR);
        }
        if (month == null) {
            month = calendar.get(Calendar.MONTH);
        }
        calendar.set(year, month, 1);
        return calendar.getTime();
    }
}
