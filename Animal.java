public class Animal {
    /*
        此方法的作用将dog和cat共有的内容提取出来
        让dog和cat...等等相似的动物特征继承animal(animal中的内容,子类都可以用)
     */
    private String name;
    private int age;
    private  String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void eat(){
        System.out.println("吃东西");
    }

    public void run(){
        System.out.println("奔跑中");
    }

    public Animal() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
