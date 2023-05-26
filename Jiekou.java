public interface Jiekou {//接口可以继承下面的Aa有多个可以用逗号实现
    //private String name = "111";//私有的是不允许的
    int id =1;//接口定义不赋值会报错 是静态常量 默认在int前面会有 public static final

    int function(int a,String b,Person p);//方法默认是共有的并且是抽象方法
    public void method();//方法默认是共有的并且是抽象方法



}
interface Aa{
    void aa();
}
