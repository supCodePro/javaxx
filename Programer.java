public class Programer extends gouzao{
    private double salary;

    public Programer(String name, int age,double salary) {
        super(name, age);//调用父类的构造器
        System.out.println("子类有参");
        this.salary = salary;
    }

    public Programer() {
        System.out.println("子类无参");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
