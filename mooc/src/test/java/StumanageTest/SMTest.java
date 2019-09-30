package StumanageTest;
import Studentmanage.SM;
import java.util.Scanner;

public class SMTest {
    public static void main(String[] agrs){
        System.out.println("***************请输入姓名或学号*****************");
        Scanner sc = new Scanner(System.in);
        System.out.print("请进行输入:");
        String input = sc.next();
        SM PT1 = new SM();
        PT1.setStudent(input);
        System.out.println(PT1.getStudent());

    }
}
