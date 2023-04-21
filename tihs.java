public class tihs {
    private int id =20;

//    public int getId() {
//        return id;
//    }

    public void setId() {
        id=100;
        System.out.println(id);//这里默认访问的是局部变量 就是第二行的变量
        System.out.println(this.id);//这里访问的是成员变量第九行的变量
        this.id = id;
    }
}
