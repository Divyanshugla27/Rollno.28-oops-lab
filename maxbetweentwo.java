import java.util.*;
public class maxbetweentwo {
    public static void main(String []Args){
        Scanner in= new Scanner(System.in);
        System.out.println("enter two number");
        int num1=in.nextInt();
        int num2=in.nextInt();
        if(num1>num2){
            System.out.println(num1+"is Greater than"+num2);
        }
        else if(num1==num2){
            System.out.println(num1+"add"+num2+"are equal");
        }
        else{
            System.out.println(num2+"is greater than"+num1);
        }
    }
}

