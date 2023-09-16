import java.util.*;
public class divisibleby5and11 {
    public static void main(String[]Args){
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number to be checked ");
        int num1 = in.nextInt();
        if(num1%5==0&&num1%11==0){
            System.out.println(num1+"is divisible by 5 and 11");
        }
        else if (num1%5==0&&num1%11!=0){
            System.out.println(num1+"is not divisilbe by 11 but by 5");
        }
        else if(num1%11==0&&num1%5!=0){
            System.out.println(num1+"is not divisible by 5 but by 11");
        }
        else{
            System.out.println(num1+"is not divisible by 5 and 11");
        }
    }
}
