package learn;

import java.util.Arrays;

public class TestCountPlus {
    public static void main(String[] args) {
        int count=0;
        int a=count++;
        count=count++;
        count=count++;
        count=count++;
        count=count++;
        count=count++;
        count=count++;

        System.out.println(count);
        count=++count;
        System.out.println(count);
        count=++count;
        System.out.println(count);
//        Arrays.copyOf()
        int x=3;
        int y=1;
//        if(x=y)
            System.out.println("Not equal");
//        else
            System.out.println("Equal");
        boolean b=true?false:true==true?false:true;
        System.out.println(b);

    }
}
