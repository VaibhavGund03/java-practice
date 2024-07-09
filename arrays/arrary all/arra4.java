import java.util.Scanner;
public class arra4 {
    public static void main (String args[]){

        // array creation in 4 ways

        int marks []= new int[10];

        int number [] = {1,2,3,4,5,6,7,8,9,10};

        int numbers []={11,12,13,14,15};

    String stdNAme[] ={"Om","Vaibhav","Raj","Onkar"};

// get input form user in array
Scanner sc = new Scanner (System.in);

// array create
int sub[]=new int[3];
// get input sentence
System.out.print("enter the best three subject marks =");
// declare my input
 sub[0] =sc.nextInt();
 sub[1] =sc.nextInt();
 sub[2] =sc.nextInt();
// show output
System.out.print("makrs of phy ,chem , math  is = "+sub[0]+" "+sub[1]+" "+sub[2]+" ");


// Update marks
sub [2]=99;
System.out.println("math = "+sub[2]);

int percentage =(sub[0]+sub[1]+sub[2]) / 3;

System.out.println("percentage = "+percentage+"%");

System.out.println("length of array = " +sub.length);
    }
    
}
