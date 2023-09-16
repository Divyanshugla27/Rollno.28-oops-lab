import java.util.*;
public class vowelcheck {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the aphabet to be checked ");
        char a = in.next().charAt(0);
        if(((a=='a')|(a=='e')||(a=='i')||(a=='o')||a=='u')||((a=='A')||(a=='E')||(a=='I')||(a=='O')||a=='U')){
            System.out.println("given input is an vowel");
        }
        else{
            System.out.println("given input is not a vowel");
        }
    }
}
