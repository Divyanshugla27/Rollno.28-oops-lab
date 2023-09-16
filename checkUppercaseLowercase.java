import java.util.*;
public class checkUppercaseLowercase {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the character to check");
        char a = in.next().charAt(0);
        if (a >= 'a' && a < 'z'){
            System.out.println("given input is a lowwercase alphabet");
        }
        else if (a >= 'A' && a <= 'Z'){
            System.out.println("given input is a Uppercase digit");
        }
        else{
            System.out.println("enter a valid value");
        }
    }
}