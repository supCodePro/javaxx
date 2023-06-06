public class Jdjiekou implements Comparable{
    private int id;

    private String name;

    private int age;

    public Jdjiekou(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Jdjiekou() {
    }

    @Override
    public String toString() {
        return "Jdjiekou{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
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
        if(this==o){//地址一样是同一个对象 返回0
            return 0;
        }if(o instanceof Jdjiekou){
            Jdjiekou jj=(Jdjiekou)o;
            return this.age-jj.id;
            //如果想从大到小 return -（this.age-jj.id);
        }
        //如果o不是jdjiekou就认为是this大
        return -1;
    }
}
