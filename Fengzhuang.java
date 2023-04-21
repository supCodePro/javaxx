public class Fengzhuang {
    public int aa;//公共的修饰符
    int bb;//缺省的
    private int cc;//私有的
    public void method1(){
    method3();//本垒内可以调用私有的
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
    }
    void method2(){

    }
    private void method3(){

    }
}
