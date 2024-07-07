// find the product of A and B;

public class fun5 {
 //parameter function
    public static int product(int a ,int b){
         int prod = a*b;
        return prod;
    }
    // main function
    public static void main (String args[]){
        int a = 10;
        int b = 10;
     int pro = product(a,b);
     System.out.println("a*b = "+pro);
     
     pro = product(10,20);
     System.out.println(pro);
    }
    
}
