public class DtStudent extends Dtperson{
    private double score;

    @Override
    public void eat(){
        System.out.println("学生吃");
    }

    public void study() {
        System.out.println("学习");//多态使用不了子类独有的
    }
}
