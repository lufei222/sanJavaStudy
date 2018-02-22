package designpattern;

public class testPrototype {
    private String name;
    private String age;
    private  String sex;
    private String hobby;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void display(){
        System.out.println(sex+"，"+hobby);
    }
public void setLove(String sex,String hobby){
        this.sex=sex;
        this.hobby=hobby;
}
private static class test{
    public static void main(String[] args) {
        testPrototype t1=new testPrototype();
t1.setLove("man","badminton");
        testPrototype t2=t1;
        t1.setLove("woman","badminton");

        testPrototype t3=t1;
        t1.display();
        t2.display();
        t3.display();


    }
    }

}
