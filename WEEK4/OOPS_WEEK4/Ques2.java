package WEEK4.OOPS_WEEK4;

class outer{
    void display(){
        System.out.println("This is an outer class");
    }
    class inner{
        void display(){
            System.out.println("This is an inner class");
        }
    }
}

public class Ques2{
public static void main(String[] args) {
    outer obj1=new outer();
    obj1.display();
    outer.inner obj2=obj1.new inner();
    obj2.display();
} 
}
