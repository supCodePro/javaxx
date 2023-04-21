public class Employee {
    private int id;
    private String name;
    private double salary;
    private char gender;

    //提供一个全参构造器
    public Employee(int i,String n,double s,char g){
        id=i;
        name=n;
        salary=s;
        gender=g;
    }
    //提供一个无参构造器
    public Employee(){
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getInfo(){
        return id+"id"+name+"name"+salary+"salary"+gender+"gender";
    }
}
