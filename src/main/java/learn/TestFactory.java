package learn;

import java.util.ArrayList;
import java.util.Properties;

public class TestFactory {
    String s="";
//    final int i;
    int j;
    ArrayList a=new ArrayList();
    public void doSomething() {
//        System.out.println(++j + i);
    }
//    char foo='';
//        public static void hello() {
//            System.out.println("hello");
//        }
    Properties p=new Properties();

    public static void main(String[] args) {
        /**
         * 另一种简单工厂
         * 利用Class.forName(clz.getName()).newInstance()
         */
        System.out.println("=====另一种简单工厂利用Class.forName(clz.getName()).newInstance()======" +
                "\n个人觉得不好，因为这样和简单的new一个对象一样，工厂方法应该用于复杂对象的初始化" +
                "\n 这样像为了工厂而工厂");
        //兰州拉面
        INoodles lz = StaticNoodlesFactory.createNoodles(LzNoodles.class);
        lz.desc();
        //泡面
        INoodles pm = StaticNoodlesFactory.createNoodles(PaoNoodles.class);
        pm.desc();
    }

    }

