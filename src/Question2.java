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
        do {
            name=in.next();
            salary=in.nextDouble();
            list.add(new Pair<String, Double>(name,salary));
            c++;
        }while (!name.equals("0"));
        Pair<String, Double> ans=list.get(0);
        System.out.println(ans.getKey()+" "+ans.getValue());

    }
}
