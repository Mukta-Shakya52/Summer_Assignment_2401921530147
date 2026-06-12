package WEEK2.Day5;
import java.util.*;
public class Group_anagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char []ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        sc.nextLine();
        String[]str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        List<List<String>> answer=groupAnagrams(str);
        for(List<String> s:answer){
            System.out.print(s+" ");
        }
        sc.close();
    }
    
}
