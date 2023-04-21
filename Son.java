public class Son extends Father {
    public String name = "son";
    public void method(){
        //this调用成员变量，看类型 son类中的this的类型就是son
        //this在哪个类中this就是谁
        System.out.println("子类的"+this.name);//子类的
        this.eat();//是子类的eat
    }
    public void eat(){
        System.out.println("son吃");
    }
}
