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
int bestThree []=new int[3];
// get input sentence
System.out.println("enter the best three subject marks =");
// declare my input
int sub1 =sc.nextInt();
int sub2 =sc.nextInt();
int sub3 =sc.nextInt();
// show output
System.out.print("makrs is = "+sub1+" "+sub2+" "+sub3);


    }
    
}
