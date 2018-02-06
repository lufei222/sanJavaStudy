package learn;

public class testStrParam {
        public static void main(String[] args) {
            StringBuffer a = new StringBuffer("A");
            StringBuffer b = new StringBuffer("B");
            operator(a, b);
            System.out.println(a + "," + b);
            System.out.println("bhashcode="+b.hashCode());

            String ostra="";
            String ostrb="";
            operatorStr(ostra, ostrb);
            System.out.println(ostra + "," + ostrb);
            String stra="";
            String strb="";
            equals(stra,strb);
        }
        public static void operator(StringBuffer x, StringBuffer y) {
            x.append(y); y = x;
            System.out.println("y="+y);
            System.out.println("yhashcode="+y.hashCode());

        }
    public static void operatorStr(String x, String y) {
        x="testx"; y = "testy";
    }
    public static void equals(String x, String y) {
        System.out.println("str=======test=====");
        System.out.println(x==y);;
        System.out.println(x.equals(y));;

    }
}
