/*  A company decided to give a bonuse of%5 to employee if his/her yer of services is more than 5 year 
 * ask user for their salary  and year of services and print the bonuse amount
*/
import java.util.Scanner;

public class con4{
    public static void main(String[]args){
        // for read a user input to create a scanner object

        Scanner s =new Scanner(System.in);

        // ask user salary 
        System.out.println("enter the current salary =");

        double salary = s.nextDouble();

        // ask year of service
        System.out.println("enter your year of service");
        int yearOfService = s.nextInt();

        double bonus = 0;
         if(yearOfService >=5){

            bonus = salary* 0.05;
            
         }
         System.out.println("your net amount is = "+bonus);


    }
}
