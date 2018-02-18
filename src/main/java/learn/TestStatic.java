package learn;

public class TestStatic {
    public TestStatic t1=new TestStatic();
    public TestStatic t2=new TestStatic();
    static{
        System.out.println("hi there");
    }

    {
        System.out.println("test constructor");
    }
    public TestStatic(){
        System.out.println("no param constructor");
    }
    public TestStatic(int i){
        System.out.println("has param constructor");
    }

    public void print(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        TestStatic st1= new TestStatic();
        System.out.println("st1");
        st1.print();
        TestStatic st2= new TestStatic(2);
        System.out.println("st2");
        st2.print();

    }
}
