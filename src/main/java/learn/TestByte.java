package learn;

public class TestByte {

    public static void main(String[] args) {
        test();
    }
        public static void add(Byte b)
        {
            b = b++;
        }
        public static void test()
        {
            Byte a = 127;
            Byte b = 127;
            add(++a);
            System.out.print(a + " ");
            add(b);
            System.out.print(b + "");
        }
        public TestByte(){

        }

}
