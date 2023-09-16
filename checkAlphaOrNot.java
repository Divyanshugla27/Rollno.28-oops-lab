import java.util.*;
public class checkAlphaOrNot {
    public static void main(String [] Args){
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number to be checked ");
        char a = in.next().charAt(0);
        if(((a>='a')||(a<='z'))&&((a>='A')||(a<='Z'))){
            System.out.println("it is a ablphabet");
        }
        else{
            System.out.println("it isnt a alphabet");
        }
    }
}

