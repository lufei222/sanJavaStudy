package test;

import java.util.*;

/**
 * Created by luosan on 2016/12/18.
 */
public class hashMapTest {

    Map<Integer,Integer> b=new Hashtable<Integer, Integer>();
    public static void main(String[] args) {
        Long t1 = System.currentTimeMillis();
        System.out.println("时间："+t1);
        List<Integer> a=new ArrayList<Integer>();

        for(int i=0 ;i<100000;i++){
            a.add(i,4);
        }
        Integer sum=1000000;
        for (Integer i:a){
            sum=10000+a.get(i);
        }
        Long t2 = System.currentTimeMillis();
        System.out.println("时间："+t2);

        System.out.println("总共用时"+(t2-t1));
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
