

import java.util.Scanner;

public class ifelse {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter hte number");
        int a = sc.nextInt();

        if(a>0){
            System.out.println(a+" is positive number");

        }else if(a<0){
            System.out.println(a+" is negative number");
        }
        else{
            System.out.println(a+"is zero");
        }

    
    }
    
}
