package WEEK2.OOPS_WEEK2.live;
import WEEK2.OOPS_WEEK2.music.Playable;
import WEEK2.OOPS_WEEK2.music.string.Veena;
import WEEK2.OOPS_WEEK2.music.wind.Saxophone;
public class Test {
    public static void main(String[] agrs){
        Veena obj1=new Veena();
        obj1.play();
        
        Saxophone obj2=new Saxophone();
        obj2.play();

        Playable p;
        
        p=new Veena();
        p.play();

        p=new Saxophone();
        p.play();
    }
}
