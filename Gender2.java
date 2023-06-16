public enum Gender2 {
//默认是私有 不能该成公有
    //没有属性，就没必要显示创建构造器
    BOY("1"),GIRL("2");
    private String value;//有属性的情况

    public String getValue() {//属性可以对外提供get方法
        return value;
    }

    Gender2(String value) {
        //同样可以设置构造器 但是设置构造器第一行无参的构造器需要添加小括号
        this.value = value;
    }

    @Override
    public String toString() {
        return "Gender2{" +
                "value='" + value + '\'' +
                '}';
    }
    //对象列表必须在类的首行
    //相当于创建了两个对象，一个是boy 一个是girl
    //语法：对象和对象之间都好隔开分号结束
    //对象默认就是公有的静态的常量
    //默认就是采用的无参构造器创建的对象
    //public static final Gender2 BOY = new Gender2();
}
