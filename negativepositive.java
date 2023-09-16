import java.util.*;
public class negativepositive {
    public static void main(String[] Args){
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number to check");
        int num1=in.nextInt();
        if(num1>0){
            System.out.println(num1+"is a postive number");
        }
        else if(num1<0){
            System.out.println(num1+"is a negative number");
        }
        else{
            System.out.println(num1+"is zero");
        }
    }
}
