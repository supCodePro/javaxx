public class Chu_shihua_k {
    private String name;
    //类中有可能会存在多个构造器(需求需要)
    //需求，在创建chushihuakuai对象的时候,要执行一段代码(10行代码)
    public Chu_shihua_k(String name) {
        System.out.println("name构造器");
        // this();
        fangfa();//通过调用方法满足需求
        //System.out.println("一般来说根据上面需求可以直接在这里写就可以满足");
        this.name = name;
    }

    public void diaoyong (int id){
        System.out.println("id构造器");
        //this();//这里演示的是直接用this调用无参构造器也可以
    }

    public Chu_shihua_k() {
        System.out.println("无参构造器");
        //fangfa();//通过调用方法满足需求
        System.out.println("一般来说根据上面需求可以直接在这里写就可以满足");
    }
    {
        //实例初始化块，每次实例化对象都会自动执行(和构造器差不多但是调用哪个构造器都会执行)
        System.out.println("通过这里调用每个构造器时都会调用这里的内容");
    }
    //但是为了追求复用性和学习的内容我们可以创建个方法
    public void fangfa(){
        System.out.println("通过调用方法满足需求");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
