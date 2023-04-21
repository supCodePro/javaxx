public class Father {
    public String name = "Father";
    public int age;

    public void function(){

        //成员变量的调用，看对象的类型，Father中的this是什么类型的对象 是father类型的
        //this在哪个类中this就是谁
        System.out.println(this.name);
        this.eat();//这里调用也是子类的
        //这里this是当前对象 类型是Father为什么调用的是子类的 eat
        //成员方法在调用的时候，看的是对象的实际对象(new 的是谁)，this的实际类型 这里new的是son所以调用的是son
        //属性看类方法看对象
    }

    public void eat(){
        System.out.println("Father吃");
    }
}
