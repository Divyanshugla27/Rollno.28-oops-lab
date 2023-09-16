import java.awt.desktop.SystemEventListener;
import java.util.*;
public class maxbetweenthree {
    public static void main(String[] Args){
        Scanner in= new Scanner(System.in);
        System.out.println("enter three number");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+"is the greatest num");
            }
            else{
                System.out.println(num3+"is the greatest num");
            }}
        else if(num2>num3){
            System.out.println(num2+"is the greatest num");
            }
        else{
            System.out.println(num3+"is the greatest num");
            }
        }
    }

