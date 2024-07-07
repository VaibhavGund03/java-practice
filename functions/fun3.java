// by using paramneter

import java.util.Scanner;

public class fun3 {
    public static int ReturnSub(int g,int f) // parameter and formal parameter or normal parameter , use to define time 
     {
        int sub = g-f;
       return sub;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number :- ");
        int f =sc.nextInt();
        int g = sc.nextInt();

       int subtra = ReturnSub(f,g);  // arguments or actual paramneters ,use for call time

       System.out.println("sub is :- "+subtra);
    }
}
