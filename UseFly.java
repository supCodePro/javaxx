public class UseFly {
    public static void main(String[] args) {
        Fly.staticMethod();//证明静态方法的修饰符屎public 可以跨包调用

        //
        DiaoyonFly df = new DiaoyonFly();
        df.fly();
        df.defaultMethod();//这个是默认方法 实现类可以调用到 可以被重写
        //df.staticMehood(); 这是调用不到静态方法的 只能通过类名 接口名去调用 上面第三行


        //如果去实现类diaoyonfly里面自己写一个进去 也不行 因为他不是静态的 也不能称之为重写
    }
}
