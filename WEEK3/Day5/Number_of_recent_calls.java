package WEEK3.Day5;
import java.util.*;
class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q=new LinkedList<>();
    }
    
    public int ping(int t) {
        q.offer(t);
        while(!q.isEmpty() && q.peek() < t-3000){
            q.poll();
        }
        return q.size();
    }
}

public class Number_of_recent_calls {
    public static void main(String[] args){
        RecentCounter obj=new RecentCounter();

        System.out.println(obj.ping(1));
        System.out.println(obj.ping(100));
        System.out.println(obj.ping(3001));
        System.out.println(obj.ping(3002));

    }
}
