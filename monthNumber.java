import java.util.Scanner;
public class monthNumber {
    public static void main(String []Args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the month number");
        int a= in.nextInt();
        if(a==1){
            System.out.println("no of days is this month are 31");
        }
        else if(a==2){
            System.out.println("no of days is this month are 28");
        }
        else if(a==3){
            System.out.println("no of days is this month are 31");
        }
        else if(a==4){
            System.out.println("no of days is this month are 30");
        }
        else if(a==5){
            System.out.println("no of days is this month are 31");
        }
        else if(a==6){
            System.out.println("no of days is this month are 30");
        }
        else if(a==7){
            System.out.println("no of days is this month are 31");
        }
        else if(a==8){
            System.out.println("no of days is this month are 31");
        }
        else if(a==9){
            System.out.println("no of days is this month are 30");
        }
        else if(a==10){
            System.out.println("no of days is this month are 31");
        }
        else if(a==11){
            System.out.println("no of days is this month are 30");
        }
        else if(a==12){
            System.out.println("no of days is this month are 31");
        }
        else{
            System.out.println("enter a digit between 1 to 12 for getting the name of the month ");
        }
    }

}