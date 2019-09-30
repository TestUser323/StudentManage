package Cat;

public class cat {
    private String name;
    private int age;
    private String sex;
    public int size;

    public static int price;

    public cat(){
        System.out.println("这是一个无参的构造方法");
    }
    public cat(String name,int size){
        this.name=name;
        this.size=size;
        System.out.println("这是一个有参的构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //成员方法
/*    public void eat(){
        System.out.println("小猫爱吃鱼的方法");
    }*/
   //加上static变成类方法
/*    public static void eat(){
        run(); //静态方法中不能直接访问同一个类中的费静态成员,只能直接调用同一个类中的静态成员
        cat temp = new cat();
        temp.run();//只能通过对象实例化后,对象.成员方法的方式访问非静态成员
        this.name="cest";//静态方法不能使用this
        name="ces";//静态方法中不能直接使用属性
        price=300; //静态方法中可以直接使用静态树精
        cat.price=15; //静态方法中必须使用类名调用静态方法
        System.out.println("小猫爱吃鱼的方法");
    }*/
    public void run(){
        System.out.println("小猫快跑方法");
    }

}
