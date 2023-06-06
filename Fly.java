public interface Fly {
    void fly();//抽象方法

    //静态方法 -->静态方法以前都是通过对象或类名调用
    //好多接口，都会伴随工具类  Collection   --> Collections (对Collection的操作)
    static void staticMethod(){
        System.out.println("fly的静态方法");
    }

    //默认方法  可理解成接口的普通方法（和抽象类还有区别吗？）
    default void defaultMethod(){
        System.out.println("fly里的默认方法");
    }
}
