package WEEK4.OOPS_WEEK4;

class box{
  double length;
  double breadth;
  box(double length,double breadth){
    this.length=length;
    this.breadth=breadth;
  }
   double area(){
    return length*breadth;
   }
}
class box3D extends box{
  double height;
  box3D(double length,double breadth,double height){
    super(length,breadth);
    this.height=height;
  }

  double volume(){
    return length*breadth*height;
  }
}
public class Ques4{
    public static void main(String[] args) {
        box3D obj1=new box3D(5,10,3);
        System.out.println("Area calculated is :"+ obj1.area());

        System.out.println("Volume calculated is :"+obj1.volume());
    }
}
