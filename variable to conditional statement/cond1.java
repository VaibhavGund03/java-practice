// write a java program to get a number from the user and print whtether it is positive or negative.
import java.util.Scanner;
public class cond1{
    public static void main(String[]args){

        Scanner s =new Scanner(System.in);
        System.out.println("enter the number = ");

        int input = s.nextInt();
        //int input = 35;

        if(input > 0){
            System.out.println("number is positive");

        }else if(input < 0)
        {
            System.out.println("number is negative");

        }else{
            System.out.println("number is zero");
        }

    }

}
