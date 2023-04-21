package Test.Abc;

public class Test {
    public static  void main(String[] args){
        //除法 “/”整形数据之间的除法 有浮点数据参与的

        int a=10;
        int b=4;
        int c=a/b;//得到的是商数
        int d=a&b;
        System.out.println(c);
        System.out.println(d);

        double e=3;
        double f=a/e;
        System.out.println(f);//3.333...


        double g=-2;
        double h=a/g;
        System.out.println(h);

    }
}
