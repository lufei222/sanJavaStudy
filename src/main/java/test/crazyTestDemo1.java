package test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

/**
 * java·è¿ñ½²ÒåµÄÒ»Ð©test
 */
public class crazyTestDemo1 {

    public static void main(String[] args) {
        // test1();
        test2();
        test3();
        test4();
        test5();
        test6();

    }

    public static void test1() {
        System.out.println("Hello World!");
        StringBuilder sb = new StringBuilder();
        sb.append("java");
        System.out.println(sb);

        sb.insert(0, "hello");
        System.out.println(sb);

        sb.replace(5, 6, ",");
        System.out.println(sb);

        sb.delete(5, 6);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        Math.sqrt(2.3);
        System.out.println("math++" + Math.abs(-3));
        Random rand = new Random();
        Float aFloat = 100f;
        //   System.out.println(rand.nextFloat(aFloat));
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }

    public static void test2() {
        Collection books = new HashSet();
        books.add("·è¿ñjava½²Òå");
        books.add("»ùÓÚj2eeµÄajaxÆóÒµÓ¦ÓÃÊµÕ½");
        books.add("Struts2È¨ÍþÖ¸ÄÏ");
        Iterator it = books.iterator();
        while (it.hasNext()) {
            String book = (String) it.next();
            System.out.println(book);
            if (book.equals("Struts2È¨ÍþÖ¸ÄÏ")) {
                it.remove();
            }
            book = "²âÊÔ×Ö·û´®";
        }
        System.out.println(books);

    }

    public static void test3() {
        TreeSet nums = new TreeSet();
        StringBuffer buffer = new StringBuffer();
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);
        System.out.println(nums);
        TreeSet TS = new TreeSet();
        TS.add(new String("STRUCTSÈ¨ÍþÖ¸ÄÏ"));
        //   TS.add(new Date());
        System.out.println(TS.first());
    }

    enum Season {
        SPRINBG, SUMMER, FALL, WINTER
    }

    public static void test4() {
        EnumSet es1 = EnumSet.noneOf(Season.class);
        System.out.println(es1);
    }

    public static void test5() {
        List books = new ArrayList();
        books.add(new String("ÇáÁ¿¼¶J2EEÆóÒµÓ¦ÓÃÊµ¼ù"));
        books.add(new String("Struts2È¨ÍþÖ¸ÄÏ)"));
        books.add(new String("»ùÓÚJ2EEµÄAjax±¦µä"));
        System.out.println(books);
        books.add(1, new String("RORÃô½Ý¿ª·¢×î¼ÑÊµ¼ù"));
        for(int i=0;i<books.size();i++){
            System.out.println(books.get(i));
        }
        //É¾³ýµÚsan¸öÔªËØ
        books.remove(2);
        System.out.println(books);
        //ÅÐ¶ÏÖ¸¶¨ÔªËØÒÔÔÚlist¼¯ºÏÖÐµÄÎ»ÖÃ£ºÊä³ö1£¬±íÃ÷Î»ÓÚµÚ¶þÎ»
        System.out.println(books.indexOf((new String("RORÃô½Ý¿ª·¢×î¼ÑÊµ¼ù"))));
        //½«µÚ¶þ¸öÔªËØÌæ»»³ÉÐÂµÄ×Ö·û´®¶ÔÏó
        books.set(1, new String("Struts2È¨ÍþÖ¸ÄÏ"));
        System.out.println(books);
        System.out.println(books.subList(1, 2));

    }
    public static void test6(){
        //javaÈçºÎ»ñÈ¡ipµØÖ·£¿
        try {
            InetAddress addr = InetAddress.getLocalHost();
            String localname=addr.getHostName();
            String localip=addr.getHostAddress();
            System.out.println("±¾»úÃû³ÆÊÇ£º"+ localname);
            System.out.println("±¾»úµÄipÊÇ £º"+localip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
