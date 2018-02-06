package learn;

    public class TestFinal {
        public static void main(String[] args) {
            final StringBuilder sb = new StringBuilder("haha");
            //同一对象的hashCode值相同
            System.out.println("sb中的内容是："+sb);
            System.out.println(sb+"的哈希编码是:"+sb.hashCode());
            sb.append("我变了");
            System.out.println("sb中的内容是："+sb);
            System.out.println(sb+"的哈希编码是:"+Math.round(4.5));


            System.out.println("-----------------哈希值-------------------");
            TestFinal test = new TestFinal();
            System.out.println(test.hashCode());
            System.out.println(Integer.toHexString(test.hashCode()));
            System.out.println(test.getClass()+"@"+Integer.toHexString(test.hashCode()));
            System.out.println(test.getClass().getName()+"@"+Integer.toHexString(test.hashCode()));
            //在API中这么定义toString()等同于 getClass().getName() + '@' + Integer.toHexString(hashCode())
            //返回值是 a string representation of the object.
            System.out.println(test.toString());


            byte b1=1,b2=2,b3,b6;
            final byte b4=4,b5=6;
            b6=b4+b5;
            b3= (byte) (b1+b2);
            System.out.println(b3+b6);

        }
        void run(){

        }

}
