package WEEK3.OOPS_WEEK3;
import java.util.Random;
abstract class Compartment{
    public abstract String notice();
}
class FirstClass extends Compartment{
    @Override
    public String notice(){
        return "This is the First Class Compartment";
    }
}
class Ladies extends Compartment{
    @Override
    public String notice(){
        return "This is the Ladies Comapartment";
    }
}
class General extends Compartment{
    @Override
    public String notice(){
        return "This is the General Compartment";
    }
}
class Luggage extends Compartment{
    @Override
    public String notice(){
        return "This is the Luggage Comaprtment";
    }
}
public class TestCompartment {
    public static void main(String[] args){
        Compartment[] comp=new Compartment[10];
        Random r=new Random();
        for(int i=0;i<comp.length;i++){
            int choice=r.nextInt(4)+1;
            switch(choice){
                case 1:
                    comp[i]=new FirstClass();
                    break;
                case 2:
                    comp[i]=new Ladies();
                    break;
                case 3:
                    comp[i]=new General();
                    break;
                case 4:
                    comp[i]=new Luggage();
                    break;
            }
        }
        System.out.println("Comapartments with their notices: ");
        for(int i=0;i<comp.length;i++){
            System.out.println("Compartment "+(i+1)+": "+comp[i].notice());
        }
    }
}
