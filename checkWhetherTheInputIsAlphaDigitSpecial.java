import java.util.*;
public class checkWhetherTheInputIsAlphaDigitSpecial {
    public static void main(String [] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the character to check");
        char a=in.next().charAt(0);
        if(a>='a'&&a<'z'||a>='A'&&a<='Z'){
            System.out.println("given input is a alphabet");
        }
        else if(a>='1'&&a<='9'){
            System.out.println("given input is a digit");
        }
        else if(a=='@'||a=='#'||a=='$'||a=='&'||a=='?'){
            System.out.println("given input is a special character");
        }
        else{
            System.out.println("give a valid value");
        }
    }
}
