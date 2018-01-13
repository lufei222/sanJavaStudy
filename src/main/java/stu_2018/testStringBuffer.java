package stu_2018;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class testStringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        String str="";
        str.length();
        stringBuffer.append("12345");
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.delete(1,2));



        ArrayList list = new ArrayList();
        for( int i=0;i <10;i++ ) //给数组增加10个Int元素
            list.add(i);
//..程序做一些处理
        list.remove(5);//将第6个元素移除
        for( int i=0;i <3;i++ ) //再增加3个元素
            list.add(i+20);
        Integer [] values = (Integer[])list.toArray();//返回ArrayList包含的数组
        Float a= 1.0f%0;

        ArrayList<String> s = new ArrayList<String>();


s.add("a");
s.add("b");
s.add("c");

    }
}
