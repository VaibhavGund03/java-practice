//

public class pattern3 {
    public static void main (String args[]){
        for(int a =1; a <=10; a++){
            for(int b=1 ;b<= 10-a+1;b++)
            // logic formula numberof line - a +1; 10-a+1

            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
