public class gouzao {
    private String name;
    private int age;

    public gouzao(String name, int age) {
        //super()构造器默认有的调用父类的无参构造
        System.out.println("父类有参");
        this.name = name;
        this.age = age;
    }

    public gouzao() {
        //super()构造器默认有的调用父类的无参构造
        System.out.println("父类无参");
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
}
