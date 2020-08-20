import java.util.*;

public class Question1 {
    static HashMap<Integer,Integer> map=new HashMap<>();
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t,z;
        while (true){
            t=in.nextInt();
            if ((t== 0)) break;
            if (map.containsKey(t)){
                int a=map.get(t);
                a++;
                map.replace(t,a);
            }
            else map.put(t,1);
        }
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
