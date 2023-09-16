import java.util.*;
public class usingWhilePrintNaturalNumber {
    public static void main(String [] Args){
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number till which natural number has to be printed");
        int n=in.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
