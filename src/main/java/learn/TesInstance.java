package learn;

public class TesInstance {


    class A {
    }

    class B extends A{
    }

    class C extends A{
    }

    class D extends B {

    }

    public static void main(String[] args) {

        A obj = new TesInstance().new D();

        System.out.println(obj instanceof B);
        System.out.println(obj instanceof C);
        System.out.println(obj instanceof D);
        System.out.println(obj instanceof A);
    }
}