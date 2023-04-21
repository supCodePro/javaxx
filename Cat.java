public class Cat extends Animal{
    private String name;
    private int age;
    private  String color;

    public String getName() {
        return name;
    }
    /*
        如果 没有参数 cat类会对父类继承下来的eat方法做更新
     */
    public void eat(int a){
        System.out.println("cat类中的eat"+"吃东西");
        this.eat();//这是本类重写之后的 本类内调用本类的方法
        super.eat();//这是重写之前的 是父类的方法
    }
    public void superEat() {
        super.eat();
    }

    public void run(){
        System.out.println("奔跑中");
    }
    public void pashu(){
        System.out.println("爬树");
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

