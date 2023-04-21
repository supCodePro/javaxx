public class MyUtil {
   //public 可以不写 void 意思是无参无返回值 print打印（没有参数 有放这里） {方法体u}
    public void print(){
        for(int i=0; i<5;i++){
            System.out.println("打印五次");
        }
    }
  //有参无返回值
    //打印指定行数的直角三角形(行数是由调用者决定的)
    /*    行数，使用谁指定行数-->参数的设置
    蚕食也可以理解为调用者的需求
            如果想让我打印直角三角形，必须给我一个int值*/
  //public 可以不写 void 意思是无参无返回值 print打印（没有参数 有放这里） {方法体u}
    public void printNum(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<i+1;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
    //有参无返回值遍历数组
    public void showArrys(int [] arrs){
        for(int i =0;i<arrs.length;i++){
            System.out.println(arrs[i]);
        }
    }
    //大小排序
    public void sort(int [] arrs){
        for(int i =0;i<arrs.length;i++){
            for(int j =0;j< arrs.length-i-1;j++){
                if(arrs[i]>arrs[j+i]){
                    int temp = arrs[j];
                    arrs[j]=arrs[j+1];
                    arrs[j+1]=temp; 
                }
            }
        }
    }
    /*无参有返回值
    随你产生一个四位数字。然后将结果返回给调用者*/
    public int randomNum(){
        int num =(int)(Math.random()*9000+1000);
        return num;//数据必须和返回值类型相一致
    }
    //判断示例
    public int randomNum1(){
        int num =(int)(Math.random()*9000+1000);
        if(5>3){
            return num;
        }else{
            return 0;
        }
    }
    //有多个数据需要返回的情况下
    public int[] randomArrs(){
        int num =(int)(Math.random()*9000+1000);
        int[] arrs = new int [1];
        arrs[0]=num;
        arrs[1]=2;
        return arrs;//数据必须和返回值类型相一致

    }
    public int[] randomArrs1(){
        //下面是返回三个随机数的练习

        int arrs [] =new int[3];
        for(int i =0;i<arrs.length;i++){
            int num =(int)(Math.random()*9000+1000);
            arrs[i]=num;
        }
        return arrs;
    }

    //有参有返回值
    //需求产生随机个数的指定数字
    public int[] readonNum(int count){
        int [] arrs=new int[count];
        for(int i = 0;i<arrs.length;i++){
            arrs[i]=(int)(Math.random()*9000+1000);
        }
        return arrs;
    }
    public int sum(int a,int b){

        return a+b;
    }
    public int sumarrs(int [] arrs){
        int sum=0;
        for(int i=0;i<arrs.length;i++){
            sum+=arrs[i];
        }
        return sum;
    }
    //使用可变参数
    //可变参数语法：数据类型...变量名
    public  int sumsum(int...arrs){//一个方法中可变参数必须在最后一位而且只能有一个可变参数
        int sum=0;
        for(int i=0;i<arrs.length;i++){
            sum+=arrs[i];
        }
        return sum;
    }
    public int puls(int a,int b){
        return a+b;
    }

    public int puls(int a,int b,int c) {
        return a+b+c;
    }

        public void method(int a){
        //method()如果这样子写就死循环
            System.out.println("666");
            if(a<3){
                a++;
                method(a);
            }
        }
}

