/* a school has follow rule for grading system;*/
import java.util.Scanner;

public class con5 {
    public static void main(String[]args){
    
        Scanner s =new Scanner(System.in);

        System.out.println("Enter your marks : ");

        int x = s.nextInt();
        if(x<25){
            System.out.println("F   Grade ");
        }

        else if((x>=25)&&(x<45)){

            System.out.println("E  Grade ");
        }

        else if((x>=45)&&(x<50)){
            System.out.println("D  Grade ");
        }

        else if((x>=50)&&(x<60)){
            System.out.println("C Grade ");

        }

        else if((x>=60)&&(x<80)){
            System.out.println("B  Grade");

        }

        else if((x>=80)&&(x<98)){
            System.out.println("A Grade");
            
        }

        else if((x>98)&&(x<=100)){
            System.out.println("Topper in the class");
        }

        else{
            System.out.println("please inter a correct MArks ");
        }

    }
    
}
