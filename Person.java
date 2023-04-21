public class Person {
     /*
     * 人类的模板
     * 定义一个人类 根据类型创建出来有哪些属性 以及哪些行为
     * 变量有两种 一个局部标量一个成员变量
     * */
    String name;//姓名 郝美女
    int age;//年龄 17
    char gender;//性别 女
    long phone;//电话 19999999999
    double stature;//身高 171.3
    boolean adult;//是否成年 false
    float fufian;;//浮点类型数据
    byte zijie;//字节类型
    /* 顺便复习八大数据类型 要牢记 */
    OtherPerson ops;//在成员变量里存其他信息
    class Person2{
        String name1;//姓名 郝美女
    }
    public class main1{//公有
        int i=0;//缺省
        public int ii;//公有


    }

    private void main2(){//私有

    }
    void main3(){//省略

    }

    public void setfengzhuang(int a){
        if(a>0&&a<120) {
            age = a;
        }else{
            System.out.println("不能设置");
        }
    }
    public int getfengzhuang1(){
        return age;
    }
}

