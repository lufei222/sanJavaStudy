package learn;

/**
 * Created by luosan on 2018/2/4.
 */
public interface testInterface {
     public String str="";
    abstract void test1();
   public abstract void a();
    static void s() {
    }
     default void d(){

    }
    void b();//默认用abstract修饰
    int a = 0;//默认用static final 修饰
     public void aa();
     public boolean setFlag();
     public float get(int x);

}
