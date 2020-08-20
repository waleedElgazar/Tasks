import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int cmt=10;
        while (cmt!=0){
            String x=in.next();
            int c=1,cnt=0,counter=0,m=0;
            for (int i = 0; i < x.length(); i++) {
                if(x.charAt(i)=='('){
                    c=0;
                    cnt++;
                }else {
                   if(c!=1&&cnt!=0)cnt--;
                }
            }
            System.out.println(cnt == 0);
            cmt--;
        }
    }
}
