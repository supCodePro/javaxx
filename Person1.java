public class Person1 {
    int id;
    String name;
    int age;
    private int age1;

    //构造器 当你new出来对象的时候小括号默认调用构造器
    //无参构造器
    public Person1(){
        System.out.println("无参");
    }
    //有参构造器
    public Person1(String n){
        System.out.println("有参");
        name=n;
    }
    public void steAge1(int a){
        if(a>0&&a<120){
            age1=a;
        }else{
            System.out.println("不给设置 超过阈值");
        }
    }
    public int getAge1(){
        return age1;
    }
    /*
    功能：是为所有属性赋值
     */
    public void set(int i ,String s,int n){
        id=i;
        name=s;
        age=n;
    }
    /*
    功能返回当前对象的个人信息(String 形式展示)
     */
    public String Info(){
        return id+"\t"+name+"\t"+age;
    }
}
