package learn;

public class testPerson {
    private String name = "Person";
    int age = 0;
}
     class Child extends testPerson{
        public String grade;
        public static void main(String [] args){
            testPerson p=new testPerson();
//            System.out.println(p.name);
            //string类保存字符串只是保存所有单单的字符串
            //而char字符数组，会在最后自动加上"\n"
            String s="hello";
            String t="hello";
            char c[] = {'h','e','l','l','o'};
            System.out.println(s.equals(c));
        }
    }

