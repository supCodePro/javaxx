import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class a1变量声明 {
    public static void main(String[] args) {
        //变量声明 同一个大括号内不允许有重复面变量名 byte数据类型后面的是变量名
        byte num;
        byte a;
        int b;
        //赋值
        num = 100;
        System.out.println(num);//此时 num是byte类型的数据 100
    }
}

public class a2遍历声明赋值使用 {
    public static void main(String[] args) {
        //遍历声明 赋值 使用
        byte b1;
        b1 = 100;
        System.out.println(b1);
        short b2;
        b2 = 200;
        int i;
        i = 100000;
        long l;
        l = 1000000;
    }
}

public class a3大数据转小数据 {
    public static void main(String[] args) {
        //
        int i = 10;
        String name = "123";
        //大数据转小数据
        byte b = (byte) i;
        //数据取整的时候才能用不然会数据丢失 就是说不能有小数点的数据 除非不要小数点
        System.out.println(b);
    }
}

public class a4不同数据类型只能拿大的取接收小的布尔值不参与运算 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int i = a + b;
        System.out.println(i);//结果：30

        int e = 10;
        double d = 20.1;
        double j = e + d;
        //不同数据类型只能拿大的取接收小的

        System.out.println(j);
        int q = 10;
        char f = 'a';//码值97
        int r = q + f;
        System.out.println(r);

        int n = 10;
        boolean m = true;
        int k = n + m;//布尔值不参与运算
        System.out.println(k);

        int o = 10;
        String str = "20";
        System.out.println(str + o);//2010 这里是先用字符加数字 所以字符在前面 结果是2010如果字符在后面是1020

        int y = 10;
        int u = 20;
        System.out.println("y+u=" + y + u);//先乘除后加减    结果是1020
        System.out.println("y+u=" + (y + u));//先乘除后加减   结果是30
    }
}

public class a5加号可以作为连接符 加减法 {
    public static void main(String[] args) {
        //
        int a = 10;
        int b = 5;
        int c = a - b;
        System.out.println(c);

        int d = 10;
        double e = 1.5;
        double f = d - e;
        System.out.println(f);

        int g = 10;
        char h = 'a';//97
        int i = g - h;
        System.out.println(i);

        String str = "40";
        //加减法不能作为数值 +可以作为连接符

        int j = 10;
        int k = 3;
        int l = j * k;
        System.out.println(l);

        double n = 1.5;
        double m = n * k;
        System.out.println(m);

        char o = 'a';
        int p = o * k;
        System.out.println(p);
        //乘法也不能有字符串
        System.out.println(5 + 3 * 2);//先乘除后加减
        System.out.println((5 + 3) * 2);//加括号提升优先级


        System.out.println(((5 + 3) + 5) * 2);//让这里等于26
        /*
        想先让5+3然后8+5再乘以2
         5+3
         8+5*2 8+5*2
         */

//java ()小括号永远是优先级 []中括号数组 {}大括号是代码块main方法等


    }
}

public class a6除法 {
    public static void main(String[] args) {
        //除法 “/”整形数据之间的除法 有浮点数据参与的

        int a = 10;
        int b = 4;
        int c = a / b;//得到的是商数
        int d = a & b;
        System.out.println(c);
        System.out.println(d);

        double e = 3;
        double f = a / e;
        System.out.println(f);//3.333...


        double g = -2;
        double h = a / g;
        System.out.println(h);

    }
}

public class a7除法取余数用(&) {
    public static void main(String[] args) {
        //除法百分号取模取(取余数)
        int a = 10;
        double b = -3;
        double c = a % b;
        System.out.println(c);//1

    }
}

public class a8运算符加加和减减的使用 {
    public static void main(String[] args) {
        //运算符号++自身+1
        //--自身-1
        int i = 10;
        i++;
        int o = 10;
        o--;
        System.out.println(i);//11
        System.out.println(o);//9
    }
}

//👆👆👆6.16复习到这👆👆👆
public class abc {
    public static void main(String[] args) {
        //运算符号++自身+1
        //--自身-1
        int i = 10;
        int o = i++;//除了++运算还有赋值运算
        //1 肯定是运算i++
        System.out.println(i);//11
        //将i的值赋值给i++这个整体
        System.out.println(o);//10
        //第二个是把i++赋值给o所以o的结果是10
        //++在后面是先赋值再自增
        //++再前面是先自增再赋值
        //将i赋值给i++ 2.i进行自增 3将i++的值赋给j
        int a = 10;
        int b = ++a;
        //++i会进行a的自增 2将a的值赋值给++a 3.将++a的值赋值给b
        System.out.println(a);//11
        System.out.println(b);//11
    }
}

public class abc {
    public static void main(String[] args) {
        //赋值运算符
        int a = 10;//10赋值给a；
        int b = a;//a的值赋给b
        b = 20;//把;20赋值给b
        System.out.println(b);//20
        b += 5;
        System.out.println(b);//25
        b -= 3;
        System.out.println(b);//22
        b *= 2;
        System.out.println(b);//40
        b /= 2;
        System.out.println(b);//10(商数)
        b %= 2;
        System.out.println(b);//0(余数)
    }
}

public class abc {
    public static void main(String[] args) {
        //关系运算符（比较运算）
        int a = 10;
        boolean flag = a > 10;
        System.out.println(flag);//结果是falase
        boolean flagg = a < 10;
        System.out.println(flagg);//结果是true

        double b = 12.5;
        boolean flag1 = a >= b;
        System.out.println(flag1);//结果是falase flag1是比较a是否大于等于b b是12.5 所以a比b小 结果不成立
        char c = 'a';//97
        boolean flag2 = a < c;
        System.out.println(flag2);//结果是true因为char a 赋值给c是97 然后int a=10；97比10大
        boolean flag3 = b > c;
        System.out.println(flag3);//结果是flase 因为b=12.5 c=97 所以b小于c
        boolean flag4 = true;
        System.out.println(flag3);//布尔值布参与运算
        //string也不能比较
        //可以进行比较的只有 byte short int long float double char
    }
}

public class abc {
    public static void main(String[] args) {
        //==判断相等！=判断不相等
        int a = 10;
        int b = 10;
        boolean c = a == b;
        System.out.println(c);//true 因为a和b相等 所以a和b的结果是true
        int d = 11;
        int e = 10;
        boolean f = d == e;
        System.out.println(f);//false 因为d是11e是10所以d不和e不相等

        double g = 10;//double类型等于10.0
        boolean h = g == a;
        System.out.println(g);//true 值一样就可以跟数据类型无关 如果是10.1就是false 包括char

        boolean flag8 = true;
        boolean flag9 = true;
        boolean flag10 = flag8 == flag9;
        System.out.println(flag10);

        String str = "java";
        String str2 = "java";
        boolean str3 = str == str2;
        System.out.println(str3);//true

        boolean str4 = a == flag8;//类型要相一致或者兼容
        //不等于同理
    }
}

public class abc {
    public static void main(String[] args) {
        //并且
        //或者
        //非
        //逻辑运算符
        int a = 50;
        int b = 30;
        boolean flag = a > 40 && b >= 20;
        //这里用的是双与如果第一个条件不成立就不判断
        System.out.println(flag);//true
        //a大于40并且b大于20返回true 要满足两个条件
        int c = 50;
        int d = 10;
        boolean flag1 = c > 40 && d >= 20;
        //这里用的是双与如果第一个条件不成立就不判断
        //如果是单与的话第一个不成立第二个也要判断
        System.out.println(flag1);//false
        //d是10不大于20所以是false
    }
}

public class abc {
    public static void main(String[] args) {
        //并且
        //或者
        //非
        //逻辑运算符
        int a = 50;
        int b = 10;
        boolean c = a++ > 50 && b++ > 5;
        System.out.println(c);//flase 因为&&短路了b不执行 所以是10 如果是&b执行等于11
    }
}

public class abc {
    public static void main(String[] args) {
        //或者 ||双或 和单或|
        int d = 20;
        int e = 30;
        boolean f = d > 50 || e > 10;
        System.out.println(f);//true 只要成立一个酒返回出 或者两个都成立 第一个不成立第二个成立了

        System.out.println(!(d > 10));//这个是取反 原来的结果是true返回false 原来结果是false返回true
//        亦或
//                ^相同为false 不相同为true
//            false ^false相同
//                    false^true不相同
        System.out.println(d > 10 ^ e > 20);//flase因为两个都是true是相同的
        System.out.println(d > 100 ^ e > 20);//true因为d是false一个是true所以返回true
    }
}

public class abc {
    public static void main(String[] args) {
        //三元运算符 条件？值1：值2 条件成立返回1 不成立返回2
        int a = 10;
        String str = a > 10 ? "1" : "2";
        System.out.println(str);//a小于等于10所以a不大于10返回2
        String str1 = a >= 10 ? "1" : "2";
        System.out.println(str1);//a大于等于10就返回1因为a=10
        // 接收类型要兼容
    }
}

public class abc {
    public static void main(String[] args) {
        //位运算符 跟二进制有关 左移<<:相当于乘以2的几次方 右移>>相当于除以2的几次方 无符号右移>>>
        System.out.println(5 << 3);//等于5*2的三次方
        System.out.println(10 << 4);//等于10*4的四次方
        /*
        00001010
        10100000
        */
        //二进制2的三次方和2的四次方
        //然后乘以5或10
        System.out.println(5 >> 3);//5除以2的三次方 5/8
        System.out.println(10 >> 3);//10除以2的三次方
        /*
        00000101
        00000101
        */
    }
}


//分支和选择分支
//单分支
public class 单分支 {
    public static void main(String[] args) {
        //
        java.util.Scanner xiaoming = new java.util.Scanner(System.in);
        System.out.println("请输入小明的java成绩");
        double chengji = xiaoming.nextDouble();

        if (chengji > 90) {
            System.out.println("奖励一百亿");
        }
    }
}

public class 双分支判断 {
    public static void main(String[] args) {
        //
        //当你其中一个条件成立 是不会往下执行代码的 这是按顺序执行代码的
        java.util.Scanner xiaoming = new java.util.Scanner(System.in);
        System.out.println("请输入小明的java成绩");
        double chengji = xiaoming.nextDouble();
        //如果上面输入的成绩大于90就进入第一个判断
        //（）小括号是条件 大括号是代码块
        if (chengji > 90) {
            System.out.println("奖励网红一位");
        }
        //如果是90分以下就进入第二个判断
        else {
            System.out.println("奖励少妇一位");
        }
    }
}

public class 多分支判断 {
    public static void main(String[] args) {
        //
        java.util.Scanner xiaoming = new java.util.Scanner(System.in);
        System.out.println("请输入小明的java成绩");
        double chengji = xiaoming.nextDouble();
//当你其中一个条件成立 是不会往下执行代码的 这是按顺序执行代码的
        if (chengji == 100) {
            System.out.println("奖励九百九十九百亿");
        } else if (chengji > 90) {
            System.out.println("奖励网红一名");
        } else if (chengji > 70) {
            System.out.println("奖励少妇一名");
        } else if (chengji > 60) {
            System.out.println("奖励空气");
        }

    }
}

public class 流程控制 {
    public static void main(String[] args) {
        //输入
        int a = 10;
        //a=20;
        System.out.println(a);
        //1准备输入工具
        java.util.Scanner mingzidingyi = new java.util.Scanner(System.in);
        //2.准备输入入口
        //a.整型数据
        System.out.println("请输入一个数字");
        //mingzidingyi.nextInt();//将这个代码看作用户输入的数据
        //nextInt是整数型数据
        int num = mingzidingyi.nextInt();
        System.out.println(num);//用户输入的这个可以用来做其他的运算
        //例如
        System.out.println(num + 10);
        //这个就是当int a =10；执行完之后还没有结束 要再这里输入一个东西才能运行结束 这里是int输入数字
        System.out.println("带小数的数据");
        double num1 = mingzidingyi.nextDouble();
        System.out.println(num1 + 10);
        System.out.println("字符");
        String name = mingzidingyi.next();
        String name1 = (name + 10);
        System.out.println(name1);
        //nextLine是读取一整行的数据
        String name2 = mingzidingyi.nextLine();
        System.out.println(name2);
        //nextLine有缺点 点击空格的时候会直接结束
    }
}


public class while循环 {
    public static void main(String[] args) {
        /*循环的类型分别有：
        while
            for
                do-while
                    foreach*/
        //作用提高复用性和拓展性
        //语法 while（循环条件）{代码块}
        //原理：循环条件成立，则执行代码块。执行完代码块，会再次回到循环条件判断的位置
        //如果条件依然成立，则再次执行代码块，直到循环条件不成立为止 寻呼那条件结束
        /*控制循环次数
        1循环因子
            2循环条件
                3循环因子值的改变*/
        int i = 0;//这个就是循环因子 执行这一行的时候i=0
        while (i < 5) { //执行这一行的时候i<5是成立的因为i等于0
            System.out.println("奖励九百九十九百亿" + i);//这里有一个+i的情况下 结果里面会从0开始循环01234依次循环出来
            i++;//循环银子值的改变 执行这个代码的时候这个i会++成1 因为0+1 1再回到461行 1小于5成立直到加到5停止条件不成立
        }
//这里会把sou输出五遍
    }
}

public class while循环嵌套 {
    public static void main(String[] args) {

        /*
            三行四列
        *   ****
        *   ****
        *   ****
        * */
        int i = 0;
        while (i < 3) {//控制行数 i是行数的循环因子
            //System.out.println("****");
            //再写一个循环控制每行的星号数量
            int j = 0;
            while (j < 4) {
                System.out.print("*");//这里不用ln因为*号输出不能换行 要在同一行输出
                j++;//这里循环四次就是****
            }
            System.out.println("*");//这个加ln是换行用的 当里面的 j 打印完了一行之后换行
            i++;//这里循环三次就是*
            //             *
            //             *
        }

    }
}

//for循环和while循环什么时候用？ 确定循环次数得情况加用for循环不确定循环次数的情况下用while循环
public class for循环 {
    //for循环对比while循环的优势是：将while循环的控制循环次数的三个要素总结到一个地方（循环因子; 循环条件; 循环因子值得改变 小括号就是循环因子得声明包括前面得东西要加;;）
    public static void main(String[] args) {

        // 1->2->4->3这里是一次循环 循环结束后继续从 2->4->3 直到结束
        //执行顺序  1、     2、  3
        for (int i = 0; i < 10; i++) {

            System.out.println(+i);//4//循环十次 十条0-9
//也可以把i++写在代码里
            //i++;
            //如果代码里和条件里都写i++就会自增两次 得到得结果就是02468
        }

    }
}


//do-while语法：do{代码块} while(循环条件)
//原理：先执行代码块，然后判断循环条件。如果条件成立则继续执行代码块。如果条件不成立，则循环结束。
//特点 dowhile循环至少执行一次
//使用场景 不确定循环次数的情况
public class dowhile循环 {
    //for循环对比while循环的优势是：将while循环的控制循环次数的三个要素总结到一个地方（循环因子; 循环条件; 循环因子值得改变 小括号就是循环因子得声明包括前面得东西要加;;）
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("hello java" + i); //结果是01234五条sou
            i++;
        } while (i < 5);

    }
}

//跳转结构 break & continue
//switch 不支持long、float double、boolean类型 浮点类型都不可以
//用于结束当前switch
public class switch用在结束前的break {
    public static void main(String[] args) {
        int i = 1;
        switch (i) {
            case 1:
                System.out.println("字符");
                break;//现在int是等于1 在这里break 但是 没写break的情况下会有case12两个结果
            case 2:
                System.out.println("字符2");
                break;
            case 3:
                System.out.println("字符3");
                break;
            case 4:
                System.out.println("字符4");
                break;
            default:
                System.out.println("字符5");
                break;

        }
    }
}

//用在循环内while，for，do-while,foreach
//用于结束当前循环
public class 用在循环内的break {
    public static void main(String[] args) {
        //老方法 需求输入-1的时候结束
    /*java.util.Scanner input=new java.util.Scanner(System.in);//输入入口
    boolean flag=true;//布尔值
    while(flag){
        System.out.println("请输入一个整数");
        int num=input.nextInt();
        if(num==-1)
            flag=false;
    }*/
        while (true) {
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.println("请输入一个整数");
            int num = input.nextInt();
            if (num == -1)
                break;//可以直接用break结束循环
        }
        //嵌套里有break的情况
        //执行顺序 先执行 i=0 再执行i<3 然后大括号 然后i++
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) { //i=0的情况 j会从0-4走一遍 等于1一遍 2一遍
                System.out.println(j);//输出结果是三遍01234
                if (j == 3) {
                    break;//立即结束当前（break外层的）循环 家上这个的情况下循环走到3就立即结束 不会走到4
                    //此时结果是0123
                    //如果把上面的sou放在break下面的话 结果就是012 因为j==3没来得及执行
                }
            }
        }


        //如果有需求 j==3结束外循环
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(j);
                if (j == 3) {
                    i = 4;
                    break;//这是简单的方式结束外循环
                }
            }
        }
        //另外的方式结束外循环
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(j);//0123
                if (j == 3) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
    }
}

// 2.continue
// 1.用于结束本次循环，直接进入下一循环
public class continue循环 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2)
                continue;//立即结束本次（i==2）循环，进入下一次循环
            System.out.println(i);//0134
        }
    }
}

public class 数组说明 {
    public static void main(String[] args) {
        数组就是存储数据的
        数组概念：数组是用于存储数据的长度固定的容器，保证多个数据的数据类型一致
        1、创建数组的时候，必须指定长度
        2、数组再创建的时候，需要指定的数据类型
        3、数组是有循序的（位置的顺序）
        4 数组长度确定了就不能修改
                数组的使用
        数组的定义
        1、动态初始化
        语法：
        a.数组的声明
        数据类型[] 数组名;//数组名是自定义的
        b.数组空间的开辟
                数组名 = new 数据类型[数组长度];
        二合一：数据类型[] 数组名 = new 数据而理性[数组长度];
        2、静态初始化
                数组的操作
        1、存值
        数组名[角标] = 值;
        a.值要匹配数组的数据类型
        2、取值
        数组名[角标]
        3、数组的特性
        a.数组存在默认值 默认值在动态初始化不允许更改 静态可以
        整型数组默认：0
        浮点型数组：0.0
        Sring:
        null;
        boolean:false;
        char:空白符 0 或\u000表示为空
        4、数组越界
                不能用超过定义的数组

    }
}

public class 数组动态初始化 {
    public static void main(String[] args) {
        int[] arrs;//开辟空间
        arrs = new int[5];//为arrs开辟五个连续空间用来存数据
        //将10 20 50 存到数组中
        //01234
        arrs[0] = 10;//将10存在arrs的第一个位置 //这是存值
        arrs[1] = 20;//将20存在arrs的第二个位置
        arrs[4] = 50;//将50存在arrs的第五个位置
        System.out.println(arrs);//[I@15DB9742 这个输出结果是一个地址
        // 也可以这么写 int num = arrs[0];   //将数组中第一个值赋给num
        //System.out.println("数组中第一个值："+num);
        System.out.println("数组中第一个值：" + arrs[0]);//取数组中第一个值 如果前面没有复制的话 不会报错 会是0
        //循环练习
        for (int i = 0; i < 10; i++) {
            arrs[i] = i + 1;//这个循环一直循环到十次就直接是arrs[9]=10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("数组中第一个值：" + arrs[i]);
        }
    }
}

public class 数组动态初始化练习 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String[] names = new String[5];//五个学生姓名的数组
        double[] scores = new double[5];//五个学生成绩的数组
        //通过数组的索引一一对应 姓名和成绩
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入姓名");
            String name = input.next();
            System.out.println("请输入成绩");
            double score = input.nextDouble();
            //需要将姓名和成绩存起来(数组)
            names[i] = name;
            scores[i] = score;
        }
        //信息展示
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + "的成绩为" + scores[i]);
        }
    }
}

//静态初始化数组（在创建数组的同时 将数据指定完成）
       /* a.
            数组类型[] 数组名；
            数组名=new 数组类型[]{数据1,数据2，。。3456};*/
public class 静态数组初始化 {
    public static void main(String[] args) {
        int[] arrs;
        //默认值方括号不能写长度
        arrs = new int[]{3, 5, 8};//相当于默认值
        arrs[0] = 20;//相当于修改值 0就会变成20
        //长度是3意为角标的范围是0-2
        System.out.println(arrs[0]);//3
        System.out.println(arrs[1]);//5
        System.out.println(arrs[2]);//8
    }
}
/*动态和静态的使用场景
    在创建数组的时候，不知道数据是什么就用动态初始化
        在创建数组的时候，直到数据是什么 就用静态初始化*/

public class 数组的遍历 {
    public static void main(String[] args) {
        /*int[] arrs = null;//初始化

        arrs=new int[5];//长度已知
        arrs[0]=12;
        arrs[1]=20;
        arrs[4]=25;
*/
        // System.out.println(arrs.length);//5 因为前面定义了int[5]
        //上面是动态数组
        int[] arrs1 = {2, 4, 5, 8};
        System.out.println(arrs1.length);//4 四个数据
        // 遍历数组的写法
        for (int i = 0; i < arrs1.length; i++) {
            System.out.println(arrs1[i]);
        }
    }
}

public class 数组的内存 {
    public static void main(String[] args) {

//     int num =10;
//     int[] arrs=null;
//     double[] arrays2=new double[5];//动态数组
//     arrays2[0]=12.5;
//     int[] arrs3={2,5,7};//静态数组
        double[] arrs2 = new double[3];
        arrs2[0] = 12.5;
        arrs2[1] = 1;
        arrs2[2] = 3;
        double[] arrs3 = arrs2;
        arrs3[1] = 5;//如果把arrs3的结果修改了arrs2也会跟着改
        for (int i = 0; i < arrs2.length; i++) {
            System.out.println(arrs2[i]);//12.5 1 3
        }


        for (int i = 0; i < arrs3.length; i++) {
            System.out.println(arrs3[i]);//12.5 1 3
        }
    }
}

public class abc {
    public static void main(String[] args) {
        //找出数组的最大值
        int[] arrs = {23, 5, 8, 76, 3};//静态数组
        int max = arrs[0];//将数组的第一个数据给到max
        for (int i = 1; i < arrs.length; i++) {
            //从数组的第二个值开始找
            if (arrs[i] > max) {
                max = arrs[i];
            }


        }
        System.out.println(max);//76
        //找出数组的最大值及其下标
        int[] arrs2 = {23, 5, 8, 76, 9};//静态数组
        int max2 = arrs2[0];//将数组的第一个数据给到max
        int index = 0;

        for (int i = 1; i < arrs2.length; i++) {
            //从数组的第二个值开始找
            if (arrs2[i] > max2) {
                max2 = arrs2[i];//76
                index = i;//当他找完最大值在[i]里面i就是他的下标最小值
            }
        }
        System.out.println(index);//3
        System.out.println(max2);//76
        //求和
        int[] arrs9 = new int[]{23, 5, 8, 76, 3};//静态数组
        int count = 0;//偶数个数
        int sum = 0;
        for (int i = 0; i < arrs9.length; i++) {
            sum += arrs9[i];
            if (arrs9[i] % 2 == 0) {//这里是偶数个数
                count++;//这里是偶数个数
            }
        }
        System.out.println("求和" + sum);//这里的结果是全部数组相加=124
        System.out.println(sum / arrs9.length);//求平均数 如果要求小数在arrs前面加上 （double）20
        System.out.println(count);//偶数个数


        int[] arrs10 = {23, 7, 8, 7, 3, 76};
        //复制
        //创建一个新数组，然后将他复制过去
        int[] newArrs = new int[arrs10.length];
        //在一个数据一个数据的赋值
        for (int i = 0; i < arrs10.length; i++) {
            newArrs[i] = arrs10[i];
        }
        for (int i = 0; i < newArrs.length; i++) {
            System.out.println(newArrs[i]);
        }


    }
}

public class 数组的扩容 {
    public static void main(String[] args) {
        int[] arrs = {2, 3, 4, 4, 5};
        int num = 6;
        //对数组进行扩容
        //1.新建一个新数组（长度比原来长）
        int[] newArrs = new int[arrs.length + 1];
        //2.将原来数组中的数据赋值到新数组
        //newArrs要比arrs长所以这里要用arrs不然会数组越界
        for (int i = 0; i < arrs.length; i++) {
            newArrs[i] = arrs[i];
        }
        //3.将新数组的地址赋给arrs
        arrs = newArrs;
        //对arrs进行新增数据6
        arrs[4] = 6;
        //查看数据
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);//2 3 4 5 6
        }
    }
}

public class 数组的反转 {
    public static void main(String[] args) {
        int[] arrs = {3, 5, 7, 8, 9};//如果是偶数6个数据 6/2=3 现在是奇数5/2=2求的是商数
        //1.新建一个数组 然后倒序复制
        int[] newArrs = new int[arrs.length];
        for (int i = 0, j = arrs.length - 1; i < arrs.length; i++, j--) {
            //这时候是arrs的最后一个给到newarrs的第一个
            //newArrs是从头开始 arrs是从最后开始
            newArrs[i] = arrs[j];
        }
        arrs = newArrs;
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
        //2.对原数组首尾交换
        for (int i = 0; i < arrs.length / 2; i++) {
            //上面是奇数所以除以2
            /*
             * 第一次循环是0和4
             * 第二次是1和3
             *
             * 如果是偶数
             * 第一次是0和5 前面的数字0就是等于 i 后面的5就是arrs.length-i-1
             *                            当i等于0的时候arrs.length是6-i-等于5
             * 第二次是1和4
             * 第三次2和3...
             */

            int temp = arrs[i];//定义一个临时变量暂时存i
            arrs[i] = arrs[arrs.length - i - 1];//覆盖掉arrs[i]
            arrs[arrs.length - i - 1] = temp;
        }
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);//9 8 7 5 3
        }
    }
}

public class 数组的查找一顺序查找 {
    public static void main(String[] args) {
        char[] arrs = {'q', 'w', 'x', 'z', 'x'};
        boolean f = false;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] == 'x') {
                f = true;
                break;
            }
            if (f) {
                System.out.println("有 ");
            } else {
                System.out.println("没有");
            }
        }
    }
}

public class 数组的查找二分查找 {//数组必须是有大小顺序的

    public static void main(String[] args) {
        int num = 15;//找3再数组中的位置
        int[] arrs = {3, 5, 7, 8, 9, 15, 26};//如：查找3 会先将中间的值7取出来看是不是和3一样 如果不一样就比较大小 如果比7小就丢掉后面的从前面查找
        //left和right就是查找的范围
        int left = 0;//left等于起点
        int right = arrs.length - 1;//终点
        int mid = (left + right) / 2;//中间的索引
        int index = -1;
        while (true) {//不知道循环多少次找到 先写死循环
            if (num == arrs[mid]) {//判断num是不是等于mid
                index = mid;
                break;
            } else if (num > arrs[mid]) {//小
                left = mid + 1;
            } else if (num < arrs[mid]) {//大
                right = mid - 1;
            }
            mid = (left + right) / 2;//mid要重新计算一次
        }
    }
}

public class 冒泡排序 {//数组必须是有大小顺序的

    public static void main(String[] args) {
        //1.冒泡1 写循环 让数组中的最大值出现在数组的最后一个位置
        //2.冒泡2 写循环让数组第二大的值出现在数组的倒数第二个位置
        //两两对比 大值放在后面！
        int[] arrs = {3, 15, 7, 28, 9};
        //1.冒第一个跑
        for (int i = 0; i < arrs.length - 1; i++) {//有五个数据循环四次就可以了所以-1
            if (arrs[i] > arrs[i + 1]) {
                //如果进入了if。需要交换位置
                int temp = arrs[i];//顶一个临时变量
                arrs[i] = arrs[i + 1];//然后把i覆盖掉
                arrs[i + 1] = temp;//arrs被temp覆盖掉
            }
        }

        //将蒂耶人格泡放在第二个位置
        for (int i = 0; i < arrs.length - 1 - 1; i++) {//有五个数据循环四次就可以了所以-1
            if (arrs[i] > arrs[i + 1]) {
                //如果进入了if。需要交换位置
                int temp = arrs[i];//顶一个临时变量
                arrs[i] = arrs[i + 1];//然后把i覆盖掉
                arrs[i + 1] = temp;//arrs被temp覆盖掉
            }
        }
        //上面的写法要一个一个写循环 应该要这么写
        for (int j = 0; j < arrs.length - 1 - 1; j++) {
            for (int i = 0; i < arrs.length - 1 - j; i++) {//有五个数据循环四次就可以了所以-1
                if (arrs[i] > arrs[i + 1]) {//如果想谁大在前面就把大于号改成小于号就可以了
                    //如果进入了if。需要交换位置
                    int temp = arrs[i];//顶一个临时变量
                    arrs[i] = arrs[i + 1];//然后把i覆盖掉
                    arrs[i + 1] = temp;//arrs被temp覆盖掉
                }
            }
        }


        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);//3 9 15 ，9   28
        }
    }
}

public class 简单选择排序 {//数组必须是有大小顺序的

    public static void main(String[] args) {
        //1.让数组中的最大值出现在数组的最后一个位置
        //2.让数组第二大的值出现在数组的倒数第二个位置
        int[] arrs = {3, 15, 7, 28, 9};
        int max = arrs[0];
        int index = 0;
        for (int i = 1; i < arrs.length; i++) {
            if (arrs[i] > max) {
                max = arrs[i];
                index = i;
            }
        }
        System.out.println(max);//28
        System.out.println(index);//3

        //交换位置 index 和 arrs.length-1
        if (index != arrs.length - 1) {
            int temp = arrs[index];
            arrs[index] = arrs[arrs.length - 1];
            arrs[arrs.length - 1] = temp;

        }
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);//3 15 7 9 28
        }

        //找第二个值的时候
        for (int j = 0; j < arrs.length - 1; j++) {//找最大值的次数
            int[] arrs = {3, 15, 7, 28, 9};
            int max = arrs[0];
            int index = 0;
            for (int i = 1; i < arrs.length - j; i++) {//这里i等于1是因为第一个值已经给了max
                if (arrs[i] > max) {
                    max = arrs[i];
                    index = i;
                }
            }
            System.out.println(max);//28
            System.out.println(index);//3

            //交换位置 index 和 arrs.length-1
            if (index != arrs.length - 1 - j) {
                int temp = arrs[index];
                arrs[index] = arrs[arrs.length - 1 - j];
                arrs[arrs.length - 1 - j] = temp;

            }
        }
    }
}

/*二维数组*/

public class 二维数组 {
    public static void main(String[] args) {
        int[] arrs = new int[5];
        //arrs 中存储的是基本数据类型，但是arrs本身是引用数据类型
        String[] strs = new String[5];
        //strs中存储的是引用数据类型,strs也是引用数据类型
        //基本数据类型8个 引用数据类型2个
        //1.使用
        /*a.定义
                数据类型[] []数组名;
                数据类型 数组名[][];

         */
        int[][] arrs1;
        int arrs2[][];
        /*b.初始化
        1。动态初始化
        数组名=new 数据类型[][];
        二维数组的空间以及小数组的空间都会开辟
        二维数组的空间存储的是小数组的地址,
        小数组中存储的是数据类型的默认值,
        int arrs2 [1][]
        第二种情况只指定大数组的空间不指定小数组的空间
        2.静态初始化
        */
        arrs1 = new int[3][2];
        System.out.println(arrs1);//二维数组的地址值
        System.out.println(arrs1[0]);//ix001 内存位置
        System.out.println(arrs1[0][0]);//0
        //赋值
        arrs1[0][1] = 10;//将10赋值到arrs1中第一个小数组的第二个位置
        //第二种情况只指定大数组的空间不指定小数组的空间
        int[][] arrs3;
        arrs3 = new int[3][];
        System.out.println(arrs3);//二维数组的地址值
        System.out.println(arrs3[0]);//null 因为没有指定小数组空间
        System.out.println(arrs3[0][0]);//空指针报错 因为没有小数组
        //开辟数组空间
        int[] arrs5 = new int[5];
        arrs1[0] = arrs5;
        int[] arrs6 = new int[2];
        arrs1[1] = arrs6;//长度不一样也可以
    }
}

/*
 * 1.面向过程与面向对象
 *
 * 面向过程比如开学校
 * 调研(开在哪里比较好)
 * 找地方办学校
 * 装修
 * 招生
 * 毕业
 * 倒闭
 *
 * 2.面向过程：以过程，步骤为主，考虑怎么做 自己执行
 * 3.面向对象：以对象(谁)为主，考虑谁来做，谁能做 自己是指挥者
 *
 * 1.1类和对象
 * 类：人类(抽象的概念) 存在的是人 人类就是抽象的整体概念 猪类 猫类 狗类 (具有相同特征行为的)
 * 对象: 马牛逼 张口 李逵 (真正存在的实体) 对象就是你的名字 真正存在的实体 就可以称为对象(可以通过属性和行为描述的事物)
 *       如李逵的身高是一米 体重是900kg 学历是幼儿园 行为是 会玩 会唱歌 跳舞
 *
 *
 *       类和对象的关系：
 *                    类是对一类事物的描述，是抽象的
 *                    对象是对一类事物的实例，是具体的
 *                     类是对象的模板，对象是类的实体
 *                       生产手机：手机设计图(理解为类)
 *                       手机(理解为对象)
 *       世界上是先有人(对象)再有人类(类) 有人了才能成为人类
 *       在java中是现有类再有对象
 * 4.类的定义(设计图的研发)
 *       属性: 人的姓名：String name; 人的年龄 int age; 人的性别：char gender
 *       行为：方法
 *       定义一个人类 看左边文件Person
 * */
/*
 * 5.对象的创建和使用
 * new 类名();实例化一个对象
 *自定义的类自己创建的类型都是引用数据类型
 * */
public class 创建对象 {
    public static void main(String[] args) {
        //创建对象
        Person person;//1.对象名的定义 //语法和变量的定义是一样的数据类型 变量(对象)名
        new Person();//2.初始化 //新对象（Person类的实例）
        Person psn = new Person();//新建了对象 并且给对象赋值了abc
        //String 就是java提供的一个类，自己定义野兽派hi可以的
        psn.name = "111";//对属性进型访问 psn.这个是赋值
        System.out.println("这个实体类的年龄是：" + psn.age + "名字是" + psn.name);//取值
        //一个实体类可以创建两个对象
        Person psn1 = new Person();
        OtherPerson ops = new OtherPerson();
        psn1.name = "222";
        System.out.println("第二个对象的名字是" + psn1.name);
        //他们是独立的不相互影响
        psn1.ops = ops;//成员变量里存其他信息

    }
}
/*
 * 6.类的五大成员(成员变量、成员方法、构造器、初始化块、内部类)
 * 6.1成员变量
 *           1.分类
 *                实例变量(变量是属于对象的)
 *                       实例变量如何声明
 *                          【修饰符】 数据类型 变量名 【=值】 //就是person类一样的
 *                       如何使用实例变量
 *                           前提：必须有对象
 *                                   Person psn1 = new Person();
 *                                       对象名.成员变量名字
 *                                       psn1.name="222";
 *                                        psn1.age=17;
 *                             取值：
 *                                   System.out.println("第二个对象的名字是"+psn1.name);
 *                 成员变量的特点
 *                               成员变量是有默认值的
 *                                   看数据类型有默认值
 *                                       System.out.println(psn1.adult);
 *                 实例对象的值是相互独立的
 *                         Person psn = new Person();
 *                         psn.name="111";
 *                                       Person psn1 = new Person();
 *                                       psn1.name="222";
 *                 成员变量和局部变量的区别
 *                                       实例变量:类中，方法外
 *                                       局部变量：方法中或者方法声明上（形式参数）
 *                                               public class Car {
 *                                                                   String color //成员变量
 *                                                                   public void drive(){
 *                                                                                       int speed = 80；
 *                                                                   sout(speed)
 *
 *                                                                       }
 *                                                                    }
 *                                         成员变量：直接在类中
 *                                         局部变量：某个局部(方法内\if内\循环内 )
 *                                                   if(xxx=null){
 *                                                                  int i =0;//局部变量
 *                                                                   sout(i)
 *                                                                   }
 *                作用范围不一样
 *                             成员变量：类中直接使用 psn1.name
 *                             局部变量:当前方法作用域使用
 *                初始化的值不同
 *                             成员变量：有默认值
 *                             局部变量：没有初始化不允许使用
 *                生命周期不同
 *                             成员变量：对象被回收的时候，销毁
 *                             局部变量：当前大括号运行完毕，就销毁
 *              如果想在成员变量里存其他信息 也参考psn
 * */

/*
 类的第二大
            成员方法
                    类：一组具有相同特征(属性),相同行为的对象的集合，抽象出来的概念
                    属性：通过变量去存储数据
                    方法：一段可以运行的代码
                                        简单的方法
                                                public void 方法名注：首字母要大写 (){
                                                // 代码 之前在main方法写的都可以写
                                                }
                                                示例 左侧的fangfa类 和下面的示例fangfa1

 */
public class fangfa1() {
    public static void main(String[] args) {
        fangfa ff = new fangfa();
        fangfa ff1 = new fangfa();
        ff.name = "123";
        ff.age = 18;
        ff.gender = '1';
        ff.Say();
        ff1.Say();
        //这么写好处是复用性高 不用重复的写sout很麻烦 这个也是人们常说的封装在方法里
        //比如初始化两个这个方法的时候 就很方便


    }
}

/*
   方法的原则
            1.先声明后使用
            2.调用一次执行一次，不调用不执行
                调用一次压入一个方法栈
    成员方法的分类
                1.实例方法，属于对象的，必须有对象才可以
                2.类方法（讲静态方法stic的时候有）
    方法的语法
    1种：无参无返回值
        //public 可以不写 void 意思是无参无返回值 print打印（没有参数 有放这里） {方法体u}
        无参:方法名的小括号里无任何内容
        无返回值：返回值位置写void
    2种：有参数无返回值
        //public 可以不写 void 意思是无参无返回值 print打印（参数列表：可以是任意类型 可以是多个） {方法体u}
        有参:方法名的小括号内指定参数列表
    3种：无参数有返回值
        [public] 返回值类型 方法名(){代码体}
        有返回值 只能指定一个返回值 可以是任意类型
        如果需要返回多个相投类型的数据可以自己做个数组
        如果有多个不一样类型的数据，可以用集合
        调用方如何接收返回值
                        数据类型 变量名 =对象.方法();//接收的数据类型要和返回值类型兼容或一致
    4种：有参数有返回值
                修饰符：可写可不写  返回值类型 方法名（[形参列表]）{方法体}
                1. 修饰符 可有可无
                2.返回值类型   重点
                3.方法名 自定义名字(符合变量名的规则和规范)
                4.形参列表     重点
                5.方法体 main方法中可以写的，该位置都可以写的
 */
public class 无参无返回值() {
    public static void main(String[] args) {
        //需求：打印五次
        //这是面向过程的思想，自己亲自实现(执行者)
        for (int i = 0; i < 5; i++) {
            System.out.println("打印五次");
        }
        //看看谁能做这个事情，没人能做就创建一个人来做
        MyUtil mu = new MyUtil();
        mu.print();
        //这么做的好处是下次要做这个需求直接用这个
    }
}

public class 无参无返回值() {
    public static void main(String[] args) {
        //需求：打印五次
        //这是面向过程的思想，自己亲自实现(执行者)
        for (int i = 0; i < 5; i++) {
            System.out.println("打印五次");
        }
        //看看谁能做这个事情，没人能做就创建一个人来做
        MyUtil mu = new MyUtil();
        mu.print();
        //这么做的好处是下次要做这个需求直接用这个
    }
}

public class 有参无返回值() {
    public static void main(String[] args) {
        MyUtil mu = new MyUtil();
        mu.printNum(5);
    }
}

public class 无参有返回值() {
    public static void main(String[] args) {
        //随机产生一个四位数字
        //自己写的话就是
        //int num =(int)(Math.random()*9000+1000);
        //对象完成
        MyUtil mu = new MyUtil();
        mu.randomNum();//需要得到rn随机产生的数字，这是不接受返回值 输出是空的

        int a = mu.randomNum();
        System.out.println(a);

    }
}

public class 有参有返回值 {
    public static void main(String[] args) {
        MyUtil mu = new MyUtil();

        int[] ints = mu.readonNum(1);
        mu.showArrys(ints);
    }
}

public class 方法调用练习 {
    public static void main(String[] args) {
        FunLean fl = new FunLean();
        fl.Num(12, 13);

    }

}

public class 可变参数 {
    public static void main(String[] args) {
        //可变参数是对数组做的简化操作(在调用处简化)

        MyUtil mu = new MyUtil();
        mu.sum(30, 29);
        /*上面的方法只能一个一个创建参数然后运行*/
        int[] arrs = {3, 6, 7, 9};
        System.out.println(mu.sumarrs(arrs));//这种方法可直接像用几个就用几个

        System.out.println();
        mu.sumsum(1, 3, 5, 7, 9);//由于是可变参数，实参可以是0-n个

    }

}

/*方法的重载
            最终的好处：解决我们相同类型方法,起方法名的问题
            方法的要求：在同一个类中，不允许出现两个完全相同的方法
                 要求：a.在同一个类中，方法名可以相同
                      b.但是形参列表必须不同(个数、顺序:指的是数据类型的顺序 如(int a, double b),(double b, int a)、类型)任何一个不同就能满足
                 举例：在myUtil.plus方法
                      和返回值无关
                      重载方法调用的时候，先找完全符合的，再找兼容的找不到找兼容的
                      不能有两个兼容的 否则报错 数组除外 数组不会冲突
*/
public class 方法重载 {
    public static void main(String[] args) {
        //可变参数是对数组做的简化操作(在调用处简化)

        MyUtil mu = new MyUtil();
        mu.puls(12, 13);
        mu.puls(66, 88, 99);
//        mu.puls(new int[]{66,88,99});
    }

}

/*参数的传递机制
              形参：在方法定义位置，指定的形式参数
              实参：在调用方法是，需要指定史迹的参数
              参数的传递机制：实参赋给形参的过程
              举例：public int puls(int a,int b) 括号里的是形参
                   mu.puls(66,88,99);括号里的是实参

 */
/*递归:（循环方法的一种）
    1：直接递归
              方法自己调用自己
    2.间接递归
    A调用->b->c->a
    写递归一定要有出口
 */
public class 直接递归 {
    public static void main(String[] args) {
        MyUtil my = new MyUtil();
        my.method(0);
    }

}

/*对象数组
        对象数组的技术要求和普通数组都一样
        复习：{
            int[] arrs=new int[5];基本数据类型
            String[] arrs=new String[5];//引用数据类型数组}
            Person1[] pers=new Person[5];
                    对象数组的默认值是null;
                    该数组的元素，存储的是Person对象(Person对象的地址)


 */
public class 对象数组 {
    public static void main(String[] args) {
        int[] arrs = new int[5];//基本数据类型数组
        String[] strs = new String[5];//引用类型数组 会开辟五个连续数组空间 没引用的话就是null值
        Person1 ps = new Person1();
        ps.set(13, "13", 13);
        Person1 ps1 = new Person1();
        ps1.set(130, "130", 130);
        Person1 ps2 = new Person1();
        ps2.set(1300, "1300", 1300);
        Person1[] prs = new Person1[3];//对象类型数组 默认值是null 下面是对象数组的示例
        prs[0] = ps;
        prs[1] = ps1;
        prs[2] = ps2;
        for (int i = 0; i < prs.length; i++) {
            System.out.println(prs[i].Info());
        }

    }

}
/*
    封装
        面向对象三大特性：封装、继承、多态、(抽象)
                        1.1封装：
                            封装的好处：安全、保护隐私
                                      主要集中在对属性的封装：
                                            1.1.1.对需要封装的属性设置访问权限
                                            1.1.2.对外提供两个方法(对变量的操作 设置和获取)
                        1.2权限(访问)修饰符:
                                设置元素(类、成员变量、成员方法)的访问范围
                                名称                              本类内(访问权限)         本包内           其他包
                            public//公共的
                            缺省(不写)                                  √                   √               √
                            protected//受保护的                         √                   √               x
                            private//私有的                             √                   √               √
                            类的权限修饰符只能是public或者不写
                            变量和方法这四个修饰符都能使用                  √                   x               x

                         2.封装类 必备三要素
                                1.私有的属性
                                2.公有的get/set方法
                                3.公有的无参构造器
                                一般情况
                                1.私有的属性
                                2.公有的Gget/set方法
                                3.全参构造器(所有属性值初始化)
                                4.显示的创建无参构造器
                                5.getInfo方法--->toString()
                                参考Gzao类
 */

public class 封装 {
    public static void main(String[] args) {
        //大体意思就是可以使用调用不报错就是有访问权限 不能就是没有权限
        //封装1.1.1示例
        Fengzhuang fz = new Fengzhuang();//这就是有权限能调用
        fz.aa = 1;
        fz.bb = 2;
        //fz.cc=3;//这里报错了 因为cc是私有的 不能访问
        fz.method1();
        fz.method2();
        //fz.method3();//没有权限
        //封装1.1.2示例
        Person1 psn = new Person1();
        Person1 psn1 = new Person1();
        psn.steAge1(18);
        psn1.steAge1(500);//设置Age1的值
        System.out.println(psn1.getAge1());//获取Age1的值
    }

}


/*
    1.构造器 类的五大成员之第三大成员
            成员变量、成员方法、构造器、初始化块、内部类
            构造器用于构建对象(实例化对象)
            Person1 psn = new Person1();//后面这个括号就是调用构造器的
            构造器又成为构造方法 和方法类似
    2.构造器语法
               方法的语法： 【修饰符 (public之类的)】 返回值类型 方法名(形参列表){代码块 }
               构造器的语法：
                           1.没有返回值(void)也没有
                           2.方法名必须和类名一致
                           示例： 修饰符 类名(形参列表){代码块}
    3.构造器的执行时机
                    再实例化对象时，调用！
                    构造器是默认存在的 写了就会覆盖
                    构造器是可以重载的

    构造器和set方法各有用途
                        有参构造器：在实例化对象的时候就已知属性值
                        set方法:单个属性值的修改
    4.封装类 必备三要素
                                1.私有的属性
                                2.公有的get/set方法
                                3.公有的无参构造器
                                一般情况
                                1.私有的属性
                                2.公有的Gget/set方法
                                3.全参构造器(所有属性值初始化)
                                4.显示的创建无参构造器
                                5.getInfo方法--->toString()
                                参考Gzao类

 */

public class 构造器 {
    public static void main(String[] args) {
        Person1 psn1 = new Person1();//这样默认调用了Person1午餐构造器 执行的时候就直接执行了 每实例化一次调用一次
        Person1 psn2 = new Person1("构造器");

    }

}

public class 构造器练习 {
    public static void main(String[] args) {
        Employee ep = new Employee();//无参构造器
        ep.setId(1);
        ep.setGender('男');
        System.out.println("上面是无构造器赋值 需要一个个赋值很麻烦");
        Employee ep1 = new Employee(1, "123", 9900, '男');//有参构造器 较为简单 如果有数据较为简单
        System.out.println(ep1.getInfo());
    }

}

/*
    this关键字
            含义：当前对象(不是当前类)
            用法
                1.this.内容
                          场合:所有方法(包括构造方法)
                          作用：区分局部变量和成员变量的问题(在java是允许局部变量和成员变量重名的)
                2.this()
 */
public class this的用法 {
    public static void main(String[] args) {
        tihs ts = new tihs();
        ts.setId();
    }
}
/*
    this关键字二:
                2.this()
                场合:应用在构造器
                功能：调用本类的其他构造器
                注意：this()必须在第一行
 */
public class this的用法2 {
    public static void main(String[] args) {
        tihs1 ts1 = new tihs1(1,"劳斯莱斯","粉");
    }
}

/*
    标准javabean
    java-->实体类 参考封装类
 */
/*
    包
    ide创建的时候就会有包路径
    语法：全部小写通过.分割级别
    作用：
    1.避免类重名(有必要创建两个同名的类)
    2.分为别类的管理
        java.lang包下的内容是核心内容
        java.net
        java.io
        java.sql
        java.time
        有很多种类型 只需要了解 不需要记住
 */
public class 包 {
    public static void main(String[] args) {
        //使用其他包的类
        String str ="111";//使用了java.lang.String
        Math.random();//使用了java.lang.Math
        Scanner sc = new Scanner(System.in);//使用了java.util.Scanner
        //包是自动导入的 不需要管 了解就可以
    }
}
/*
    关键字
            static  ===静态的
            回顾：
                   成员变量：
                           实例变量：属于对象的
                           类变量：属于类的     在成员变量前添加修饰符static
                  如何使用：对象.属性(符合权限修饰符的范围)
                           例如： phone ph = new phone;
                           ph.xxx=123;
                           类名.属性(符合权限修饰符的范围)
                           例如:phone ph = new phone;
                                phone.xxx = 123;
                  成员方法:属于对象
                  类方法： 属于类 在成员方法上添加修饰符 static
                            在加载的时候依然是先加载静态资源再加载普通方法但是只是加载不调用不执行
                  静态方法使用方便：
                                 下面演示代码中有 推荐第二个
                     注意事项:
                             示例staticl中12和13行
                             静态方法只能用静态资源不能用其他非静态资源
                             静态资源内没有this关键字
                             非静态资源内都可以直接使用
                     static用途:
                                用于属性,为了资源共享
                                用于方法,是为了类名
 */
public class guanjzi{
    public static  void main (String[] args){
        staticl sta = new staticl(1,"华为",100);
        staticl sta1 = new staticl(2,"苹果",100);
        System.out.println(sta.getInfo());//结果如上
        System.out.println(sta1.getInfo());
        staticl sta2 = new staticl(3,"诺基亚",1,128);
        staticl sta3 = new staticl(4,"菠萝",0.000000001,1);
        System.out.println(sta2.getInfo1()+"static演示");
        System.out.println(sta3.getInfo1()+"static是静态 类加载的时候会先加载静态的 而且类只加载一次 在方法中没有赋值的时候就会是0");
        System.out.println("加载的时候静态会开辟一个空间 其他的都不会开辟");
        sta1.fangfa();//静态方法 演示1
        sta.jingtai();//静态方法 演示2不依赖于对象 工具类的方法就设置为static

    }
}
/*
数组工具类Arrays
        方法较多 掌握几个常用的 其他可自学
                copyodf(); //数组的拷贝--用于数组的扩容
                sort();    //数组的排序--从小到大 基本数据类型+string都可以排序
                toString(); //将数组的内容,拼接成字符串返回


 */
public class copyof{
    public static  void main (String[] args){
        int[] arrs1 =new int[10];//动态数组
        arrs1[0]=10;
        int[] arrs={1,2,3};//静态数组
        //正常拷贝一个数组操作是:
        int[] arrs2=new int[arrs.length];
        for(int i=0;i<arrs.length;i++){
            arrs2[i]=arrs[i];
        }
        //通过copyof可以省略掉上面步骤:
        int[] ints = Arrays.copyOf(arrs,arrs.length);
        for(int o = 0;o<ints.length;o++){
            System.out.println(ints[o]);
        }//循环查看结果
        int[] ints1 = Arrays.copyOf(arrs,arrs.length+1);//数组扩容
    }
}
public class sort{
    public static  void main (String[] args){

        int[] arrs={1,2,3,9,6,7};//静态数组
        Arrays.sort(arrs);
        for(int i =0;i<arrs.length;i++){
            System.out.println(arrs[i]);//只能从小到大排序
        }

    }
}
public class tostring{
    public static  void main (String[] args){

        String[] arrs={"啊","波","磁"};//静态数组
        String s = Arrays.toString(arrs);
        System.out.println(s);//{"啊","波","磁"}

    }
}
/*
    系统类(先学习个别后续补充)
    System.currentTimeMillis();1970-1-1凌晨距离此时此刻的毫秒数
    System.exit(int);
 */
public class xitong{
    public static  void main (String[] args){
        System.out.println(System.currentTimeMillis());//返回是系统值
        System.exit(0);//0为正常退出
    }
}
/*
    数学类 Math
    random()    产生0-1的随机数
    abs(int)    绝对值
    ceil(double)      向上取整(比参数大的最近的整数)
    floor(double)     向下取整(比参数小的最近的整数)
    round(double)     四舍五入
    pow(int a,int b)  取次方
    sqrt(double a)    开根号
    PI                圆周率
    max(double x,double y);返回x,y中的最大值
    min(double x,double y);返回x,y中的最小值
 */
    public class Math{
    public static  void main (String[] args){
        System.out.println(java.lang.Math.random());
        System.out.println(java.lang.Math.abs(5));//绝对值5
        System.out.println(java.lang.Math.cbrt(10.99));//向上取整   11
        System.out.println(java.lang.Math.floor(10.99));//向上取整  10
        System.out.println(java.lang.Math.round(10.99));//四舍五入  10
        System.out.println(java.lang.Math.pow(2,3));//2的3次方
        System.out.println(java.lang.Math.sqrt(2.3));//开根号
        System.out.println(9*java.lang.Math.PI);
    }
}
/*
            1.面向对象三大特性之继承
                1.1 继承的好处：
                            提高复用性
                1.2 继承的语法：
                            class Sub extends Super{}
                1.3 继承的使用时机
                    a.我们发现多个类中有相同的内容 提取出一个父类
                    b.在写子类的时候，发现有父类可以继承：
                        举例：下面的恐龙类:konglong
         */
public class jicheng{
    public static  void main (String[] args){
        Dog d = new Dog();
        d.setAge(10);
        d.getAge();
        Cat c = new Cat();
        String a ="";
        //如果不继承的话两个类大部分相同调用就会增加代码量 不能提高复用性和便捷性
        //现在删掉里面共同的东西 都放在animal里也不影响调用使用
        c.setAge(10);
        c.getAge();
        konglong kl = new konglong();
        kl.getAge();

    }
}
/*
    继承之成员变量
                2.1 父类中所有的成员变量都会被子类继承下去
                    如果父类中的成员变量是私有的，那么子类是不可以直接访问的
                2.2 成员变量不重名
                    访问成员变量是没有影响的
                2.3 成员变量重名
                    重名的情况会采用就近原则访问子类的 需要访问到父类的需要加上super.xxx

 */
public class chengyuan{
    public static  void main (String[] args){
        Dog d = new Dog();//私有不能直接访问看本类第四行

    }
}

/*
    继承之成员方法
                1.成员方法不重名
                    访问成员方法是没有任何影响的
                2.成员方法重名（相同（名称））（方法的重写-->覆盖）
                    为什么要有重写：对父类的方法进行升级
                    默认使用重写后的 如果依然想用父类原本的
                    本类内 可以通过suoer调用父类的额方法
                    其他类 没有直接的方法调用父类的方法
                          如果还是想再其他类调用可参考 cat 类17行superEat方法
                    调用时 他是有层级的先输出子类的再输出父类的
    重写的条件
            1.必须是父子类
            2.方法名必须相同
            c.形参列表必须相同(个数、类型、顺序)
            4.和返回值有关
                        返回值类型可以一致
                                        如果出现如Object在父类String在子类可以 但是如果Sring在父类Object在子类不行 因为Object是String的父类
                        对于引用数据类型来说。子类的要小于等于父类
            5.和权限修饰符有关
                            子类的权限修饰符要大于等于父类
            6.静态方法是不允许重写的因为他是属于类的
 */
    public class 继承成员方法{
        public static void main (String[] args) {
            Cat c = new Cat();
            c.pashu();//本类有的
            c.eat();//父类继承的
            //c.eat(2);//子类的
            //如果两个都重名 没有菜蔬的话会被子类重写和覆盖 会直接调用子类的

            c.superEat();//在其他类调用父类
        }


        /*
            继承之应用在成员变量
              1.this调用属性
                            this.成员变量 调用的是谁的看类型
                            this的类型是谁就看this在哪个类中
                            没有重名情况系啊
                            如果没有会自己往上找
              2.this调用方法
                            this.成员方法，调用的是谁的，看实际对象
                            this的实际对象是谁？看new的是谁

         */
    public class 继承之应用 {
            public static void main (String[] args) {
                Son s = new Son();
                s.age=1;
                s.name="帅哥";
                s.method();//这里输出是子类的 如果子类没有调用的就是父类的 可以去子类注释掉同名重构打参数试下
                //this在哪个类中this就是谁
                s.function();//这里输出的是父类的 这里调用会有疑问为什么在son对象中调用的是父类的namethis在哪个类中this就是谁
                Father fs =new Son();//多态的写法
                //这种写法 father的对象类型是 father
                //        father的对象实际是 son
            }
    }
}
/*
    继承之构造器
                1.由于构造器的名称必须和类名一致，所以子类是无法继承父类构造器的
                2.构造器的作用是初始化成员变量
                    类加载的时候，是先加载父类再加载子类
                    实例化对象的时候，父类空间优于子类对象的产生（先执行父类的构造器再执行子类的）
                    构造器的首行都默认存在一行代码 super()
                    要求：父类必须存在有参构造器，否则默认情况会出错
                     super必须再首行

 */
    public class 构造器 {
        public static void main (String[] args) {
            //构造器是为成员变量做初始化使用的
            //Programer 的属性 name/age。salary 都需要构造器初始化的话怎么实现
            //Programer g = new Programer(50000);//这里使用构造器初始化只能初始化salary
            //g.setName("小帅");//这种方法可以实现初始化但是现在学的是构造器
            /*
                调用顺序详解
                           父类无参
                           子类无参
             */
            Programer g1 = new Programer();
            /*
                父类无参
                子类有参
             */
            //Programer g2 = new Programer(5200);
            /*
                父类有参(子类构造器中已经显示的创建super(实参))
                子类有参()
             */
            Programer g2 = new Programer("123",18,5200);
        }


    /*
        java特点：单继承
                一个类只能由一个直接父类，但是一个类可以有多个子类
                具有局限性 接口可以解决局限性
                任何类都有父类如果没写extends 父类就是Object

        super关键字：
                    super：指的是子类对象中的父类空间
                    this：指的是子类对象
        用法：
                     super.内容
                            调用父类的属性或方法
                     this.内容
                            调用自己的属性或方法
                     共同点：找不到都会网上一级一级找
                     super(实参列表)
                            调用父类构造器（对父类空间进行初始化）
                     this()
                            调用子类构造器（对子类空间进行初始化）
         特点：
                      都在构造器的第一行，不能同时出现

     */
        /*
            final
                最终不能修改的
                1.修饰类
                        被final修饰不允许被继承
                        例如：Strng就是final修饰的
                2.修饰变量
                        修饰了变量改变量就变为了常量（不可以被修改）
                        final修饰成员变量必须初始化
                        final可以修饰局部变量
                        常量名建议全大写 用下划线 例如：
                        private final int AAA_BBB_CCC=10;
                修饰方法
                        该方法不能被重写 只能使用
         */
    public class final1 {
        public static void main (String [] args){
            System.out.println("被final修饰不允许被继承");
        }
        class Super {
            //final可以修饰成员变量
            private String name ;

            //第一种初始化方式：
            //private  final String name ="123";
            //第二种初始化方式：
//                                public Super(String name) {
//                                    this.name = name;
//                                }
        }
        /*final class Super {

        }*/
        public void method(){
            final int a;//final可以修饰局部变量
            System.out.println(a);//a用不了 局部变量不初始化用不了
        }
        public void xiushifangfa(){
            System.out.println("输出");
            System.out.println("如果在public后加final方法不允许被重写");
        }
        class sub extends Super{
            public void xiushifangfa(){//如果需要重载 加不加final都可以
                System.out.println("如果上面方法加了final 就不允许重写 只能使用");
            }
        }

    }

    /*
    1.实例初始化块
        类的五大成员：成员变量、成员方法、构造器、初始化块、内部类
        1.1 分类
            1.实例初始化块
                每次实例化对象自动执行的代码块
                语法：
                    {}
                功能：
                    对构造器提高复用性
                特点：
                    在构造器之前执行
                如果有继承：
                         实例化子类的对象,会先执行父类构造器再执行子类构造器，再执行子类构造器
                         如果存在初始化块，父类初始化块-父类构造器-子类初始化块-子类构造器（这是执行顺序）
            2.类初始化块
                在类加载的时候自动执行的一个代码块

 */
    public class 初始化块 {
        public void main (String[] args){}
        //Chu_shihua_k c = new Chu_shihua_k();
        Chushi_jc s = new Chushi_jc();
    }
    /*
        2.类初始化块
                    在类加载(只加载一次)的时候自动执行的代码块(只执行一次)
                    语法:
                        static{}
                     特点:在类加载的时候只执行一次
                     用途:
                           一旦使用就执行一段代码
                     如果有继承：
                                先记载父类再加载子类,所以先执行父类的初始化块
                     情况:
                          存在父子关系,都有类初始化块和实例初始化块
                          如果是new子类对象的话
                          执行顺序：父类的类初始化块->子类的类初始化块->父类的实例初始化块->父类的构造器->子类初始化->子类构造器
     */

    /*
        抽象类
             eat方法提供共性操作
             前提：父类所有的子类都对eat方法进行了重写 父类中的eat方法大括号还有用吗
                    父类是为子类提供服务的
             解答：将eat方法变为抽象方法(没有大括号)：
                 使用abstract修饰符修饰方法 删除大括号以及内容
             特点：抽象方法存在的类必须是抽象类
                  子类继承抽象类时,必须实现抽象类中所有的方法

                  重写：父类有方法体，子类覆盖父类的方法体
                  实现：父类没有方法体，子类第一次指定方法
               问：抽象类中必须有抽象方法吗
               答：不是 可有可无
               问：如果子类不能够实现抽象类的方法
               答：让下一代实现，相当于当前子类有抽象方法，把子类变成抽象类 让其他来实现
               注意：抽象类不能实例化对象、
                    抽象类有构造器 不能够实例化对象 抽象类的使用必须是父类 构造器是初始化子类对象的空间
               应用：一般作为模板工具类 一部分是确定的一部分是不确定的
     */
    public class chouxiang{
        public void main(String [] args){
            //父类中有解释
            Cx_extends cx = new Cx_extends();
            cx.eat();
            cx.work();
            Cx_ex2 cx2 = new Cx_ex2();
            cx.work();
            cx2.eat();
        }
    }
    /*
        多态：
            面向对象三大特性之一
                1.1定义
                        是指同一行为，具有多个不同表现形式(重载和重写)
                1.2前提
                        1.父子类或实现接口{二选一}
                        2.必须有重写
                        3父类引用指向对象
                1.3多态的语法
                        父类引用指向子类对象
                        举例：
                        DtEmploye3 e = new DtEmploye3();
                1.4 多态的注意事项
                    使用不了子类独有的内容
                    因为名义上是父类的，就只能调用到父类的 如果子类有重写就可以调用到子类的方法
                    如果没有重写就是父类的
                    多态只能调用父类的内容
                    成员变量
                    如果有重名的变量调用也是父类的
                    变量看类型方法看对象
                    子类独有的访问不到，如果有重名属性，调用属性看类型
                1.5 多态的用途
                        1.多态参数
                        2.多态数组 （对象数组的升级）

     */
    public class 多态 {
        public  static  void main (String[] args) {
            // 常规用法：父类的引用指向子类的对象
                DtEmploye3 e = new DtEmploye3();
                DtStudent s =new DtStudent();
             //多态
            //p的类型是Dtperson，但实际类型是DtEmploye3
                Dtperson p = new DtEmploye3();
                p.working();//多态使用不了子类独有的
                p.eat();//名义上是调用person类的方法，实际是员工
            ////p的类型是Dtperson，但实际类型是DtStudent
                Dtperson p1 = new DtStudent();
                p1.study();//多态使用不了子类独有的
                p1.eat();//名义上是调用person类的方法，实际是学生

        }
    }
    public class 多态应用之参数 {
        public static void main (String[] args){
            DtEmploye3 dt = new DtEmploye3();
            method(dt);
            DtStudent stu1 = new DtStudent();
            method2(stu1);
            //如果没有多态有几个对象就得写几个方法 有多态就很简单 如下
            method3(dt);//具有同一行为不同表现形式
            //这样调用哪个输出的就是哪个 这里就等于下面的Dtperson dp = new DtStudent();
            method3(stu1);

        }

        public static void method(DtEmploye3 dt1){
             dt1.eat();
        }
        public static void method2(DtStudent stu){
            stu.eat();
        }
        //以下是多态写法
        public static void method3(Dtperson dp){
            dp.eat();;
        }
    }

    public class 多态之数组{
        public static void main (String[] args){
            //需求，有若干个对象(员工/学生/老板)都是person的子类
            //通常写法
            DtEmploye3[] de = new DtEmploye3[5];
            DtStudent[] ds = new DtStudent[5];

            //多态写法
            Dtperson[] dp1 = new Dtperson[10];//多态数组
            dp1[0]= new DtEmploye3();
            dp1[1]= new Dtperson();
        }
    }
    /*
        父子类之间的类型转换
            1.自动转换（向上转型-多态） 小->大
            2.强制转换（向下转型）    大->小
                强制转换：
                    因为多态，调用不到子类独有的内容，我就是像调用(少见)
                    向下转型是有风险的，所以尽量少强转
     */
    public class 父子类强制转换 {
        public static void main (String[] args
        ){
            Dtperson ps = new DtEmploye3();
            //此时ps调用不到dtemp里的woring需要下面的强转
            //将ps向下转型但只能转成employe 因为ps是employe充当的
            DtEmploye3 emp = (DtEmploye3) ps;//取消多态
            //类似于👇
                double d = 12.5;
                int i =(int)d;
            //类似结束👆
                //语法：子类类型 对象名=（子类类型）父类引用
                emp.working();//转型后此时已经没有多态了
            //为什么为有风险？
                DtStudent dts =(DtStudent) ps;//因为这个语法编译时成立
            //但是运行时候不成立 本身是emp要转成stu 会报ClassCastException类型转换异常

            //怎么知道他是什么类型？因为有时候代码是这样的
            //写这个方法的时候不清楚person的实际类型是什么？（对于现在来说不是emp就是stu）
            DtEmploye3 emp2 = new DtEmploye3();
            DtStudent dtu1=() new DtStudent();
            method(dtu1);//学习
            method(emp2);//在工作
            public static void method(Dtperson ps1) {
                    if(ps1 instanceof Employee){
                        Employee emp1 =(Employee) ps1;//如果ps1属于emp就强转成emp
                        emp1.working();


                    }else if(ps1 instanceof DtStudent){
                            DtStudent dts1=(DtStudent) ps1;
                            dts1.study();
                    }

                    /*
                        如果参数是emp就工作 stu就学习
                        需要判断per的实际对象是什么
                        强转之前一定要做判断 使用 instance of 关键字
                        讲解instance of 关键字👇
                            DtEmploye3 dt3 = new DtEmploye3();//没有多态
                            Boolean dlag = dt3 instanceof DtEmploye3;
                            System.out.println(dlag);//true
                         问 上面DtEmploty属于person吗？//属于
                         如果
                            Dtperson dt3 = new DtEmploye3();
                            Boolean dlag = dt3 instanceof DtEmploye3;
                            就是名义属于person 也属于employe 如果是stu就不属于stu
                            简单分辨方法 看前面实际对象是否属于后面的类型

                     */


            }
        }
    }

    /*
        父子类之间的类型转换
            1.自动转换（向上转型-多态） 小->大
            2.强制转换（向下转型）    大->小
                强制转换：
                    因为多态，调用不到子类独有的内容，我就是像调用(少见)
                    向下转型是有风险的，所以尽量少强转
     */
    public class 父子类强制转换 {
        public static void main (String[] args
        ){
            Dtperson ps = new DtEmploye3();
            //此时ps调用不到dtemp里的woring需要下面的强转
            //将ps向下转型但只能转成employe 因为ps是employe充当的
            DtEmploye3 emp = (DtEmploye3) ps;//取消多态
            //类似于👇
            double d = 12.5;
            int i =(int)d;
            //类似结束👆
            //语法：子类类型 对象名=（子类类型）父类引用
            emp.working();//转型后此时已经没有多态了
            //为什么为有风险？
            DtStudent dts =(DtStudent) ps;//因为这个语法编译时成立
            //但是运行时候不成立 本身是emp要转成stu 会报ClassCastException类型转换异常

            //怎么知道他是什么类型？因为有时候代码是这样的
            //写这个方法的时候不清楚person的实际类型是什么？（对于现在来说不是emp就是stu）
            DtEmploye3 emp2 = new DtEmploye3();
            DtStudent dtu1= new DtStudent();
            method(dtu1);//学习
            method(emp2);//在工作
            public static void method(Dtperson ps1) {
                if(ps1 instanceof Employee){
                    Employee emp1 =(Employee) ps1;//如果ps1属于emp就强转成emp
                    emp1.working();


                }else if(ps1 instanceof DtStudent){
                    DtStudent dts1=(DtStudent) ps1;
                    dts1.study();
                }

                    /*
                        如果参数是emp就工作 stu就学习
                        需要判断per的实际对象是什么
                        强转之前一定要做判断 使用 instance of 关键字
                        讲解instance of 关键字👇
                            DtEmploye3 dt3 = new DtEmploye3();//没有多态
                            Boolean dlag = dt3 instanceof DtEmploye3;
                            System.out.println(dlag);//true
                         问 上面DtEmploty属于person吗？//属于
                         如果
                            Dtperson dt3 = new DtEmploye3();
                            Boolean dlag = dt3 instanceof DtEmploye3;
                            就是名义属于person 也属于employe 如果是stu就不属于stu
                            简单分辨方法 看前面实际对象是否属于后面的类型

                     */


            }
        }
    }

    /*
        native关键字
            本地的原生的(了解就可以了)
            追踪源码的时候，会见到这个关键字 方法不是java实现而是c语言实现
            native修饰的方法是可以被重写的

            不能和abstract修饰的修饰符有哪些

            1.final 和final不能一起修饰方法
            2.和static不能修饰方法和类
            3.和native不能一起修饰方法
            4.和private不能一起修饰方法
            static和final一起使用:
(1)修饰方法:可以，因为都不能被重写
修饰成员变量:可以，表示静态常量(2)
(3) 修饰局部变量:不可以，static不能修饰局部变量(4)修饰代码块:不可以，fina1不能修改代码块
(5)修饰内部类:可以一起修饰成员内部类，不能一起修饰局部内部类
     */


    /*
        Object 根父类
            默认是类的父类（没有显示默认父类默认是Object 创建了就是创建的父类）
            该类中的所有方法都可以被任意类使用
            根据api去学
            构造器：
                Object();
            方法：
                toString();
     */
    public class Object根父类{
        public static void main (String[] args){
            DtEmploye3 ep = new DtEmploye3();//初始化对象
            //初始化的对象除了自己创建的方法所有都是可以调到的 如toString
            ep.toString();//这行没有意义 示例而已

            String s = ep.toString();
            System.out.println(s);//地址
            System.out.println(ep);//地址
            //所有的对象，在输出或者拼接的时候，都会默认调用该对象的toString方法

            String str = new String("abc");
            System.out.println(str.toString());//为什么他输出是值不是地址？因为重写了
            //Object不能满足需求所以重写了

            //直接输出employee对象的时候，输出其他所有属性信息 该如何操作
            //Object中toString不能满足要求 所以也要重写
            //在Dtemp类中重写 查看Dtemp中toString方法
            //重写后
            System.out.println(ep.toString());//这时候点跳进去就是自己的toSttring
            //这个可以替代getInfo 返回功能 因为toString是默认调用方便点 getInfo需要调用
        }
    }

    /*
        2.getClass();反射绘制，会遇到此方法
            功能：返回对象的运行时类型(类加载的时候，会创建一个class对象)

     */
    public class getClass {
        public static void main (String args[]){
            Employee emp = new Employee();
            emp.getClass();
            System.out.println(emp.getClass());//返回emp对象在运行时的类型

            Employee emp1 = new Employee();
            System.out.println(emp==emp1);//false 因为他们不是同一个对象
            System.out.println(emp1.getClass());//他们是同一个
            System.out.println(emp.getClass());//true
        }

    }
    /*
        3.hashCode()
            将当前对象，通过哈希算法，得到一个int值
            两对相同对象(地址是一样的)经过相同的hash算法 得到的int值一定是一样的
            两个不同的对象：经过相同的hash算法 得到的int值 可能是一样的 大概率是不一样的
                集合-->HashMap集合的时候，会遇到hashCode方法
     */
    public  class hashCode{
        public static void main (){
            Employee emp = new Employee();
            System.out.println(emp.hashCode());//一串int值
            Employee emp1 =emp;
            System.out.println(emp1.hashCode());//两个值一样的

            Employee emp2 = new Employee();
            System.out.println(emp2.hashCode());//这时候两个值不一样

        }
    }
    /*
        finalize()
            java存在垃圾回收机制（自动的机制）
            没有引用的对象会被回收
            java钟被认为垃圾的对象，什么时候会被回收机制回收？
                不定时回收
            垃圾对象被回收的时候，实惠默认调用该对象的finalize方法
            让该对象做一个临终遗言（但是这个并不是回收代码）

     */
    public  class finalize{
        public static void main (){
            Employee emp = new Employee();
            emp.name = "123";
            System.out.println(emp.name);
            Employee emp1 = new Employee();
            emp1.name = "321";
            System.out.println(emp1.name);
            emp=new Employee();
            emp.name = "213";//这时候123就是垃圾对象 213将123覆盖了
            //在回收的时候会在动调用123的finalize方法 但是Obeject类继承下的的方法内什么都没有写
            //如果想看是不是123被回收emp类可以重写finlaize方法调用的就是重写之后的 下面是示例不在类里面写了
            protected void finalize() throws Throwable {
                System.out.println(this.name+"回收");
            }
            System.gc();//通知垃圾回收机制来回收垃圾（也不会立刻来回收垃圾对象）这个不是立即执行 下面是睡眠代码示例
            //程序睡眠两秒 垃圾回收机制就会运行
            try {
                Thread.sleep(2000);//睡眠两千毫秒
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("睡醒了");
        }
    }

    /*
        equals(Obeject obj)
        判断两个对象是否一致
        == 他这个主要是判断两个地址是否一致
        源码和==没有区别
        public boolean equals(Object obj){
        return (this == obj)
        }
        是STRING类型不能用==用equals
     */
    public class equals{
        public static void main(String args[]){
            String srt ="123";
            String srt1 ="123";
            System.out.println(srt==srt1);//判断两个对象是否相等 结果：true
            Scanner input = new Scanner(System.in);
            String str3=input.next();//输入123
            System.out.println(srt==str3);//这个结果是false 因为他这个主要是判断两个地址是否一致

            System.out.println("判断"+srt.equals(str3));//true 此时equals是string类重写的对比的是内容
            /*
                源码
                            public boolean equals(Object anObject) {
                            //地址是否一样，如果一样内容肯定一样
                    if (this == anObject) {
                        return true;
                    }
                    //判断anObject是否String类型
                    if (anObject instanceof String) {
                    //向下转型
                        String anotherString = (String)anObject;
                        int n = value.length;
                        判断长度是否一样，如果长度不一样返回false
                        if (n == anotherString.value.length) {
                        v1是this的字符串内容
                            char v1[] = value;
                            参数字符串的内容
                            char v2[] = anotherString.value;
                            挨个字符的对比从从头到尾 如果不一样返回false否则true
                            int i = 0;
                            while (n-- != 0) {
                                if (v1[i] != v2[i])
                                    return false;
                                i++;
                            }
                            return true;
                        }
                    }
                    return false;
                }
             */
            Person ps = new Person();

            Person ps1 = ps;

            Person ps2 =new Person();

            System.out.println(ps==ps1);//true 地址一样

            System.out.println(ps==ps2);//flase 地址不一样

            System.out.println(ps.equals(ps2));//判断ps和ps2是否一样 false
            /*
                equals练习
                    创建两个Person对象 只要name和id都一样就是同一个人
                        解 在Person类钟重写equals方法(对比内容id和name)
             */
        }
    }

    /*
        接口
            接口--->定义规则
            接口的语法
                【修饰符】interface 接口名{} --->类似于类的语法
                    定义接口的就是福和类的修饰符知识点一样
            分类
                jdk1.8之前（了解就好 已经淘汰）
                    接口中所有的成员变量，默认都是公有的静态常量 不允许修改修饰符
                    接口中所有的成员方法，默认都是公有的抽象方法
                    接口中没有构造器
                    没有初始化块
                jdk1.8之后（重要）
                    默认方法和静态方法
                特点：
                    a.接口更加纯粹的抽象类
                    b.接口不能实例化对象 (不能new)
                    c.只能作为父级(父接口)
                         子类继承父类
                         实现类实现父接口
                    d.实现类实现父接口并实现父接口钟所有的抽象方法
                        语法public class Aircraft implements Jiekou{抽象方法实现}
                关系：
                    1.类与类之间：单继承
                    2.类与接口之间:多实现
                    3.如果类有父接口 可以有父类
                    4.接口与接口之间：多继承
                示例：
                    Attack接口
                    Aircraft实现类
                    Jiekou接口
     */
    public class Jiekou1 {
        public static void main(String[] args) {
            System.out.println(Jiekou.id);//接口名调用到id说明id是静态的
            //跨包调用，说明id是共有的
            Jiekou.id=10;//不可以修改值
        }
    }
    public class JiekouNote {
        public static void main(String[] args) {
            //演示可查看usefly类
            /*
                1.接口
                    JDK1.8之前
                        1.所有的属性都是公有静态常量
                        2.所有的方法都是共有的抽象方法
                        3.接口是不能实现实例化对象的，也没有构造器
                        4.所以接口只能作为父级使用
                        5.类可以实现多个接口，但是类需要实现接口中的所有抽象方法
                        6.接口是可以继承多个接口的
                      JDK1.8
                        新增了两种类型的方法（可以有代码体）
                            静态方法
                               static void 方法名(){}
                               使用方式：接口名.方法名();一般使用在再工具方法
                            默认方法
                            default void 方法名（）{
                                sout
                            }
                            使用方式：实现类的对象.方法名
                                默认方法是可以被实现类重写的
                             冲突：
                                1.实现类是可以实现接口，同时也可以继承父类
                                    父接口和父类钟有相同的方法，默认调用父类的
                                 2.实现类是可以实现多个接口的
                                    父接口1和父接口2有相同的默认方法
                                    实现类必须重写该方法
                                        1.自己真正的重写
                                        2.选择其中一个或者都选
                                            父接口.super.方法
             */
        }
    }

    /*
        经典的接口
            1.java.lang.Comparable
                抽象方法--> int compareTo(Object obj)
                功能 this和obj对比大小
                返回值：
                    正数说明this大
                    负数说明this小
                    0一般大
                自然排序
                    对比两个对象的大小（指定根据什么比）
                在需要对比的类上实现该接口
                    1.在Jdjiekou类上实现该接口
                    2.实现该接口的抽象方法
                    3.方法体中实现比较规则
            2.java.util.Comparator -->定制排序
                int compare(Object o1,Object o2)
                定制排序
                定制排序优先级高于自然排序
     */
    public class 经典的接口 {
        public static void main(String[] args) {
            int [] arrs={1,2,3};

            Jdjiekou[] jj = new Jdjiekou[5];
            jj[0]=new Jdjiekou(1,"2",3);
            jj[1]=new Jdjiekou(2,"4",3);
            jj[2]=new Jdjiekou(3,"6",3);
            jj[3]=new Jdjiekou(4,"8",3);
            jj[4]=new Jdjiekou(5,"10",3);

            //对jj数组排序： 根id排序
            for (int i =0;i< jj.length-1;i++){
                for(int y =0;y< jj.length-i-1;y++){
                    if(jj[y].getId()>jj[y].getId()){
                        Jdjiekou temp=jj[y];
                        jj[y]=jj[y+1];
                        jj[y+1]=temp;
                    }
                }
            }
            //面向对象--->谁能完成此任务：Arrys.sort()
            //借助sort排序但是sort也不知道跟谁排序
            //sort会自动调用ComparTo方法，此时可以根据sort对数组进行排序

            //这里的重点在这里👇👇👇和经典接口2
            Arrays.sort(jj);
            //如何解决：定义一个规范 如果用户（程序员）想通过sort进行排序
            //必须实现规范（一个接口）指定根据什么排，并且指定降序或升序
            //为什么官方需要去实现接口，因为sort方法需要调用该接口中的compareTo方法
            //实现内接口必须实现compareTo方法
            for(int i =0;i<jj.length;i++){
                System.out.println(jj[i]);
            }

        }
    }

    public class 经典的接口2 {
        public static void main(String[] args) {
            Jdjiekou jj = new Jdjiekou(1,"2",3);
            Jdjiekou jj1 = new Jdjiekou(2,"3",4);
            //比较这两个对象大小
                int i = jj.compareTo(jj1);
            System.out.println(i);

        }
    }

    public class Comparator接口{
        public static void main(String[] args) {
            Jdjiekou[] jj = new Jdjiekou[5];
            jj[0]=new Jdjiekou(1,"2",3);
            jj[1]=new Jdjiekou(2,"4",3);
            jj[2]=new Jdjiekou(3,"6",3);
            jj[3]=new Jdjiekou(4,"8",3);
            jj[4]=new Jdjiekou(5,"10",3);

            Arrays.sort(jj);//这里用的是pbject//数组排序 自然排序
            //Arrays.sort(Jdjiekou,new MyComparable());
            //前提：没有权限修改jj类的代码 如第三方产品
            //采用定制排序

            //第二种情况：如果Jdjiekou2有自然排序，根据年龄从小到大
            //自然排序不满足我的要求 想要根据age从大到小
            /*
                1.改自然排序 （不能使用）
                    当遇到现在的需求的时候，发现自然排序已存在  肯定是有其他人
                    自然排序的需求 如果修改会为别人带来麻烦
                2.采用定制排序(定制排序和自然排序同时存在 首先执行定制排序)
             */
            for(int i =0;i< jj.length;i++){
                System.out.println(jj[i]);
            }
        }
        //这里作为定制排序的实现类
        class MyComparable implements Comparable{


            @Override
            public int compareTo(Object o1,Object o2) {
                if(o1==o2){
                    return 0;
                }
                if(o1 instanceof Jdjiekou && o2 instanceof Jdjiekou){
                    Jdjiekou per1=(Jdjiekou) o1;
                    Jdjiekou per2=(Jdjiekou) o2;
                    return  per1.getAge()-per2.getAge();
                }
                return 0;
            }
        }
    }


    /*
        3.内部类（了解）
            类的五大成员->成员变量、成员方法、构造器、初始化块、内部类
            分类：
                成员内部类
                静态成员内部类
                局部内部类
                匿名内部类
            3.1 匿名内部类 （只用一次情况系啊）
                语法：new 类、抽象类、接口()后面可以跟{}
                解析：大括号就是相当于是类的子类、接口的实现类的大括号
                优缺点：
                    优点：简单（省略了创建类）
                    缺点：复用性差
                jdk1.8:lambda表达式对部分匿名内部类的简化操作
                lambda表达式示例：->{
                    sout（name+age+“aaa”）
                    //也可以带有返回值return
                }

                Test test = （name，age）
          练习：
                创建一个类，定义一些属性，然后创建数组，存储对象，对数组排序
     */
    public class 匿名内部类{
        public static void main(String[] args) {
            new Car();//实例化了一个匿名对象 没有引用
            //抽象类和接口不能实例化对象，都是通过其子类使用的
            Jdjiekou[] jj = new Jdjiekou[5];
            jj[0]=new Jdjiekou(1,"2",3);
            jj[1]=new Jdjiekou(2,"4",3);
            jj[2]=new Jdjiekou(3,"6",3);
            jj[3]=new Jdjiekou(4,"8",3);
            jj[4]=new Jdjiekou(5,"10",3);
            //2.定制排序的规则时，先创建一个实现类，在实现抽象方法
            //相当于出昂见了一个Comparator接口实现类的对象，实现类没有名称，所以称之为匿名对象
            Arrays.sort(jj,new 构造器.Comparator接口.MyComparable());//定制排序


            Comparator com = new Comparator() {
                //此处相当于是Compararator接收的实现类的类体
                @Override
                public int compare(Object o1, Object o2) {
                    if(o1==o2){//地址一样是同一个对象 返回0
                        return 0;
                    }if(o1 instanceof Jdjiekou && o2 instanceof Jdjiekou){
                        Jdjiekou jj1=(Jdjiekou)o1;
                        Jdjiekou jj2=(Jdjiekou)o2;
                        return jj1.hashCode()-jj2.getId();
                        //如果想从大到小 return -（this.age-jj.id);
                    }
                    //如果o不是jdjiekou就认为是this大
                    return -1;
                }
            };
            Arrays.sort(jj,com );//定制排序

            for(int i =0;i< jj.length;i++){
                System.out.println(jj[i]);
            }
        }
    }


    //匿名内部类
    new Car(){
        //此处的大括号相当于是car子类的类体
    };

    //匿名抽象类
    new Chouxiangys(){
        //此处的大括号相当于chouxiangys子类的类体
        @Override
                public void method(){

        }
    }


}