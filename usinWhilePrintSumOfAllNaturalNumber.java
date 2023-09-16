import java.util.*;
public class usinWhilePrintSumOfAllNaturalNumber {
    public static void main(String[]Args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number up to which print");
        int i= in.nextInt();
        int ch=1;
        int A=0;
        while(ch<=i){
            A=A+ch;
            ch++;
        }
        System.out.println(A);
    }
}
