public class Gzao {
    private String name;
    private int id;

    //全参构造器
    public Gzao(String n, int i) {
        name = n;
        id = i;
    }
    //无参构造器
    public Gzao(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getInfo(){
        return id+"getInfo方法"+name;
    }
}
