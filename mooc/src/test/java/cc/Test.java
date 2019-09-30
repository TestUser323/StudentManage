package cc;

public class Test {
    int X ;int Y;
    public Test(int X,int Y)
    {
        this.X=X;
        this.Y=Y;
    }
    public static void main(String[] args){
        Test PT1 = new Test(3,3);
        Test PT2 = new Test(4,4);
        System.out.println(PT1.X+PT2.X);
    }
}
