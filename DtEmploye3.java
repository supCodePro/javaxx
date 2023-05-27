public class DtEmploye3 extends Dtperson {
    private  double salary;

    private String name;

    @Override
    public  void eat(){
        super.eat();
    }

    public void working(){
        System.out.println("工作");//多态使用不了子类独有的
    }


    public String toString(){
        return name + "\t" + salary;
    }
}
