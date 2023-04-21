public abstract class ChouXiang {
    private int id;
    private String name;

    /*
        eat方法提供共性操作
        前提：父类所有的子类都对eat方法进行了重写 父类中的eat方法大括号还有用吗
                父类是为子类提供服务的
        解答：将eat方法变为抽象方法(没有大括号)：
            使用abstract修饰符修饰方法 删除大括号以及内容
        特点：抽象方法存在的类必须是抽象类
             使用abstract修饰符修饰类
        问：eat方法被全部重写没用为什么不直接删除而是改成抽象
        答：要求子类必须要有eat方法
     */
    public abstract void eat();

    public void work(){
        System.out.println("woring");
        eat();//这里调用是谁的看this是谁
        System.out.println("working again");
    }

}
