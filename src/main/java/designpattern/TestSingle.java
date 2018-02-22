package designpattern;

public class TestSingle {
    private static TestSingle testSingle =null;
    public TestSingle(){

    }
    public static TestSingle getInstance(){
        if(testSingle==null){
            testSingle=new TestSingle();
        }
        return  testSingle;
    }

    public static void main(String[] args) {
        TestSingle t1 =TestSingle.getInstance();
        TestSingle t2=TestSingle.getInstance();
        if(t1==t2){
            System.out.println("两个对象是相同的实例");
        }
    }
}

//多线程时的单例
class Singleton{
    private static Singleton instance;
    //程序运行时创建一个静态只读的进程辅助对象
    private static Object syncRoot=new Object();
    private Singleton(){

    }
    //在同一时刻加入锁的那部分程序只有一个线程可以进去
    public static Singleton getInstance(){
//        lock(syncRoot){
            if(instance==null){
                instance=new Singleton();
            }
            return instance;
//        }
    }
}
