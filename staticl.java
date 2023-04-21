public class staticl {
    private int id;
    private String name;
    private double price;
    static int prc ;

    public void fangfa(){
        System.out.println("普通方法"+id);
    }
    public static void jingtai(){
        System.out.println("静态方法");
        //System.out.println("静态方法"+id);注意事项 id还不加载不能使用 但是可以用静态的参数
        //静态的也只能调用静态方法
    }

    private static int monmoy;//加上static就变为了类变量（属于类的--->所有对象共享）

    public staticl(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public staticl(int id, String name, double price,int monmoy) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.monmoy = monmoy;
    }

    public staticl() {

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getInfo(){
        return id+"id"+name+"name"+price+"price";
    }
    public String getInfo1(){
        return id+"id"+name+"name"+price+"price"+monmoy+"monmoy";
    }
}
