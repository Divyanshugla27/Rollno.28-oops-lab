import java.util.*;
public class weeknumber {
    public static void main(String []Args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the week number");
        int a= in.nextInt();
        if(a==1){
            System.out.println("monday");
        }
        else if(a==2){
            System.out.println("tuesday");
        }
        else if(a==3){
            System.out.println("wednesday");
        }
        else if(a==4){
            System.out.println("thursday");
        }
        else if(a==5){
            System.out.println("friday");
        }
        else if(a==6){
            System.out.println("saturday");
        }
        else if(a==7){
            System.out.println("sunday");
        }
        else{
            System.out.println("enter a digit for getting the name of day or try entering between 1 to 7");
        }
    }
}
