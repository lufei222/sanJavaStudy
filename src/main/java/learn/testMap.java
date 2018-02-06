package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testMap {
    public static void main(String[] args) {
        java.util.HashMap map=new java.util.HashMap();
        map.put("name",null);
        map.put("name","Jack");
        System.out.println(map.size());
        System.out.println(map.get("name"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = br.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int number;
        double[] marks;
        float average[];

    }
    void run1(){
run2();
    }
    static void run2(){
//run1();
    }
}
