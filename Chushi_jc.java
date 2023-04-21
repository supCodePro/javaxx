public class Chushi_jc extends Chu_shihua_k{
    public String user;
    {
        System.out.println("子类的初始化块");
    }
    public Chushi_jc(String name, String user) {

        super(name);
        this.user = user;
        System.out.println("子类有参构造");
    }

    public Chushi_jc() {
        System.out.println("子类无参构造");
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
