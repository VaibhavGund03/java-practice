

public class exception2 {
    public static void main(String[]args){
        try{
            int a[] = new int[5];
            a[5] = 30/0;

        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("check the size of array index"); 
        }
        catch(ArithmeticException e){
            System.out.println("arithematic exception occurs");

        }
        catch(Exception e){
            System.out.println("exception occure");
        }
        System.out.println("sleep of the code");
    }
    
}
