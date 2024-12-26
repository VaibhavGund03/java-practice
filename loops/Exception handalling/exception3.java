
public class exception3 {
    public static void main(String[]args){
        try{
        int a[]= new int[5];
        a[5] = 30/0;
        System.out.println(a[10]);
        }
        catch(ArithmeticException e){
            System.out.println("arithematic exception occure");

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bound exception occure");

        }
        catch(Exception e){
            System.out.println("exception occure");

        }
        System.out.println("code are sleep");
}
    
    
}
