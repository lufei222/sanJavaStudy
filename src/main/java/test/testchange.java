package test;

public class testchange {
    public static void main(String[] args) {

        String s = "sdsgd\\\nasdaedaea\nfd'";
        System.out.println("转换前："+s);

        System.out.println(s.split("\n"));

        System.out.println("转换后\n"+s);
    }
}
