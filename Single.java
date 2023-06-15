/*
            实现单例模式
*/
public class Single {

    private  static final Single SINGLE=new Single();
    private Single(){};
    public static Single getSingle(){//加static因为该方法需要通过类名调用
        //return new Single();//这同样依然不是一个对象

        return SINGLE;//正解

        /*
            另一种改成公有的形式
            private  static final Single SINGLE=new Single();
            private Single(){}; 直接就可以访问
         */
        /*
            静态代码块形式
            public  static final Single SINGLE=new Single();
            static {
                SINGLE=new Single();
                }
            private Single(){};
         */
        /*
            判断形式：
                private  static final Single SINGLE=new Single();
                private Single(){};

                public static Single getSingle()//该方法需要通过类名调用！

                if(SINGLE==null){
                SINGLE=new Single();
                return SINGLE;
                }
         */
    }
}
