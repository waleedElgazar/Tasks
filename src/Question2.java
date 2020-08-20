import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        HashMap<String, Double> map=new HashMap<>();
        String name;
        Double salary;
        while (true){
            name=in.next();
            if(name.equals("0"))break;
            salary=in.nextDouble();
            if(map.containsKey(name)){
                double sa=map.get(name);
                sa+=salary;
                map.replace(name,sa);
            }
            else map.put(name,salary);
        }
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}