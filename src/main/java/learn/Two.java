package learn;

public class Two {
    Byte x;
}
class Passo{
    public static void main(String[] args) {
        Passo p=new Passo();
        p.start();
    }
    void start(){
        Two t=new Two();
        System.out.println(t.x+"----");
        Two t2=fix(t);
        System.out.println(t.x+""+t2.x);
    }
    Two fix(Two tt){
        tt.x=42;
        return tt;
    }
}
