import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Pair<String, Double>> list = new ArrayList<Pair<String, Double>>();
        String name;
        Double salary;
        int c=0;
        while (true){
            name=in.next();
            if(name.equals("0"))break;
            salary=in.nextDouble();
            list.add(new Pair<String, Double>(name,salary));
            c++;
        }
        for (int i=0; i<list.size();i++){
            Pair<String, Double> ans=list.get(i);
            System.out.println(ans.getKey()+" "+ans.getValue());
        }

    }
}
