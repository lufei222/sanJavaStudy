package learn;

import java.util.HashMap;
import java.util.concurrent.locks.Condition;

public class TestByte {

    public static void main(String[] args) {
        System.out.println(10%3*2);
        HashMap h=new HashMap();
        h.put(null,"");
        h.put(null,"1222");
        System.out.println(h.get(null));
        test();


    }
    static{
        final String aa;

    }
        public static void add(Byte b)
        {
            b = b++;
        }
        public static void test()
        {
//            Object.wait();
//            Condition.await();
            Byte a = 127;
            Byte b = 127;
            add(++a);
            System.out.print(a + " ");
            add(b);
            System.out.print(b + "");
        }
        public TestByte(){
            final String aa;

        }


}
