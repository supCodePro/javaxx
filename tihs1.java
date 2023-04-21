public class tihs1 {
    private int id=20;
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //全参构造
    public tihs1(int id,String name,String color) {
        this(name,color);//调用本类两个参数的构造器 提高代码简洁性 且this()必须在第一行
        System.out.println("全参");
        this.id=id;
    }
    public tihs1(String name,String color) {
        System.out.println("两个参数");
        this.name=name;
        this.color=color;
    }
    public tihs1(String color) {
        System.out.println("一个参数");
        this.color=color;
    }
    public tihs1() {
        System.out.println("无参");
    }
}
