import java.util.*;
public class perfectnumber{
    public static void main(String []Args){
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=a/2)
        {
            if(a%i == 0)
            {
                sum+=i;
            }
            i++;
        }
        if(sum == a)
            System.out.println("It is Perfect Number");
        else System.out.println("It is not Perfect Number");
    }
}

