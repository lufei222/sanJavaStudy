package test;
/**
 * 虚拟机的类加载测试
 * Created by luosan on 2016/12/28.
 */
class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }
    public static int value = 123;
}
class SubClass extends  SuperClass{
    static {
        System.out.println("SubClass init!");
    }
}
class NotInitialization{
    public static void main(String[] args){
        System.out.println(SubClass.value);
    }

}

public class ClassLoader {
}