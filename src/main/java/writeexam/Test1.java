package writeexam;

import java.util.ArrayList;

/**
 * 用于测试每个静态对象操作同一个类中的静态成员变量
 * Created by luosan on 2017/4/17.
 */
public class Test1 {
    private static int x=100;
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList(22);
        for(int i=0;i<25;i++){
            a.add(1);
        }
        System.out.println(a);

//        Test1 hs1=new Test1();
//        hs1.x++;
//        Test1  hs2=new Test1();
//        hs2.x++;
//        hs1=new Test1();
//        hs1.x++;
//        Test1.x--;
//        System.out.println("x="+x);
    }
} 