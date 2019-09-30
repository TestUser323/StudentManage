package Studentmanage;

public class SM {
    private String student;
    private String stunumber;
    private String sex;
    private int age;
    private String major;
    private int lengthschooling;

    public String getStudent() {
        return "111111";
    }

    public void setStudent(String student) {
        if (student == "0")
            System.out.println("请重新输入");
        else if (student == "小明"||student=="小红"||student=="小李")
            getStudent();
            this.student = student;
    }

    public String getStunumber() {

        return stunumber;
    }

    public void setStunumber(String stunumber) {
        this.stunumber = stunumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getLengthschooling() {
        return lengthschooling;
    }

    public void setLengthschooling(int lengthschooling) {
        this.lengthschooling = lengthschooling;
    }
}
