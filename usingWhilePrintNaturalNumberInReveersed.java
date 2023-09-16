import java.util.*;
public class usingWhilePrintNaturalNumberInReveersed {
    public static void main(String [] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number till which natural number has to be printed");
        int n= in.nextInt();
        int i=n;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
}
