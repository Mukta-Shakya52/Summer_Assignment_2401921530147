package WEEK4.OOPS_WEEK4;

class Point{
    private int x,y;

    //default constructor
    public Point(){
        x=0;
        y=0;
    }
    public Point(int x,int y){
       this.x=x;
       this.y=y;
    }

    public void setX(int x){
    this.x=x;
    }

    public void setY(int y){
    this.y=y;
    }

    public void setXY(int x,int y){
    this.x=x;
    this.y=y;
    }
    
    public void display(){
        System.out.println("value of x:"+x+" ,value of y:"+y);
    }
}

public class Ques3{
    public static void main(String[] args) {
        Point obj1=new Point();
        obj1.display();

        Point obj2=new Point(5,10);
        obj2.display();

        obj2.setY(20);
        obj2.display();

        obj2.setXY(2,3);
        obj2.display();
    }
}
