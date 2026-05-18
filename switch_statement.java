 import java.util.Scanner;
 public class switch_statement{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice which day name you want to print :");
        int days = sc.nextInt();
        System.out.println("The day name is :" );
        switch (days ) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 : 
                System.out.println("Friday");
                break;
            case 6 : 
                 System.out.println("Saturday");
                 break;
            case 7 :
                System.out.println("Sunday");
                if (days  == 7){
                    System.out.println("This is last day of the week and after this day the week will start again with Monday");
                }
                break;
            default :
                System.out.println("Enter the invalid number :");
                 break;


    }
}
 }