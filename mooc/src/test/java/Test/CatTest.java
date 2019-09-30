package Test;
import Cat.*;
public class CatTest {
    public static void main(String[] args){
        cat one = new cat();
        cat parameter = new cat("test",22);
        one.setName("TestName");
        one.setAge(18);
        one.setSex("男");
        cat.price=1800;
        one.price=3000;
        System.out.println(parameter);
        System.out.println(one.getName());
        System.out.println(one.getAge());
        System.out.println(one.getSex());
        System.out.println(cat.price);
        System.out.println(one.price);
        one.run();


        cat two = new cat();
        two.setName("TestName2");
        two.setAge(22);
        two.setSex("女");
        two.price=180;
        System.out.println(two.getName());
        System.out.println(two.getAge());
        System.out.println(two.getSex());
        System.out.println(two.price);
    }

}
