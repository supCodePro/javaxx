public class Jdjiekou2 implements Comparable{
    private int id;

    private String name;

    private int age;

    private double Salary;


    @Override
    public String toString() {
        return "Jdjiekou2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Salary=" + Salary +
                '}';
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public Jdjiekou2(int id, String name, int age, double Salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.Salary = Salary;
    }

    public Jdjiekou2() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    //根据id对比大小
    /*
        根据age对比大小
        jj--this
        jj1--o
     */
    @Override
    public int compareTo(Object o) {//多态参数 object o = new jj
        if(this==o){
            return 0;
        }
        if(o instanceof Jdjiekou2) {
            Jdjiekou2 emp=(Jdjiekou2)o;
            if(this.Salary> emp.Salary){
                return 1;
            }else if(this.Salary< emp.Salary){
                return -1;
            }else {
                return 0;
                //简写形式
                //return Double.compare(this.Salary, emp.Salary);
            }
        }
        //如果参数不是本类类ing，默认一个结果
        return 1;
    }
}
