import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.util.Collections.swap;

public class Question4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1="The Collection in Java is a framework that provides an architecture to store " +
                "and manipulate the group of objects. ";
        String s2="java Collection framework provides many  interfaces (Set, List, Queue, Deque) " +
                "and classes (ArrayList, Vector,  LinkedList, PriorityQueue" +
                ", HashSet, LinkedHashSet, TreeSet).";
        String s3="Any group of individual objects which are represented as a" +
                " single unit is known as the collection of the objects. In Java, a separate framework";
        String x=in.nextLine();
        StringTokenizer nex=new StringTokenizer(x," ");
        int c1=0,c2=0,c3=0;
        while (nex.hasMoreTokens()){
            String m=nex.nextToken();
            if (s1.contains(m))c1++;
            else if(s2.contains(m))c2++;
            else if (s3.contains(m))c3++;
        }
        System.out.println(c1+" "+c2+" "+c3);
    }
}
