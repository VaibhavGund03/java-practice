/* note 

---- create multiple function in the single class

---

 
 */

// syntax with parameters.
import java.util.Scanner;

public class fun2 {
    // no use paramenter
    public static void  returnSum(){
        Scanner sc =new Scanner(System.in);
        System.out.println(" a or b ke liye number dal bhai:- ");
        int a = sc.nextInt();
        int b  =sc.nextInt();
        int sum = a+b;
        System.out.println("sum of a and b is "+sum);
    }  
    
   /*  public static void main (String args[]){

        returnSum();
        
    }  */
    // by using parameter
    
    public static void ReturnSub(int g,int f) {
        int sub = g-f;
        System.out.print("sub of g and f is :- "+sub);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number :- ");
        int f =sc.nextInt();
        int g = sc.nextInt();

        ReturnSub(f,g);

    }

}
