package learn;

public class TestOperater {
            private static final String MESSAGE="taobao";

    static{
        int x=5;
        int $s=1;
//        int new =0;
    }
    static int x,y;

    public static void main(String[] args) {
      x--;
        System.out.println(x);
      myMethod();
        System.out.println("x="+x+","+"y="+3);
        System.out.println(x+y+ ++x);
        testString();
    }
    public static void myMethod(){
        y=x++ + ++x;
    }
    //测试操作符
    public void test1(){
        int i=0;
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(++i);
        System.out.println(++i);
    }
    public static void testString(){
//        private static final String MESSAGE="taobao";//方法内不支持
        String a="tao"+"bao";
        String b="tao";
        String c="bao";
        System.out.println(a==MESSAGE);
        System.out.println((b+c)==MESSAGE);
    }
}
