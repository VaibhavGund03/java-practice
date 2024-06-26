// find largest value //
import java.util.Scanner;
public class con2 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the X  number");
        double x = s.nextDouble();

        System.out.println("enter the Y number ");
        double y =s.nextDouble();
        if(x>y){
            System.out.println("x is greater than y");
        }else{
            System.out.println("y is greater than x");
        }

    }
    
}
