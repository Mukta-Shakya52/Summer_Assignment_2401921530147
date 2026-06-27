package WEEK4.OOPS_WEEK4;

interface test{
    void square(int n);
}
class Arithmetic implements test{
    public void square(int n){
        System.out.println("Square of the figure is :"+(n*n));
    }
}
public class ToTestInt{
    public static void main(String[] args) {
        Arithmetic a=new Arithmetic();
        a.square(10);
    }
}
