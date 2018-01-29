package test;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by luosan on 2016/12/18.
 */
public class hashMapTest {
    Map<Integer,Integer> a=new HashMap<Integer, Integer>();
    Map<Integer,Integer> b=new Hashtable<Integer, Integer>();

//        public void testArray(){
//        int[] arr = {7, 3, 9, 12, 6, 2};
//        //选择排序 : 效率太低比较的次数太多
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 1; j < arr.length; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//
//                }
//            }
//        }
//
//        int[] arr13 = new int[]{1, 2, 3};
//        for (int i = 1; i < arr13.length; i++) {
//
//        }
//    }

    public static void main(String[] s) {
        testlinked();
    }

    public static void testlinked() {
        LinkedList lList = new LinkedList();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        lList.add("2");
        System.out.println("元素 2 第一次出现的位置：" + lList.indexOf("2"));
        System.out.println("元素 2 最后一次出现的位置：" + lList.lastIndexOf("2"));
    }

}
