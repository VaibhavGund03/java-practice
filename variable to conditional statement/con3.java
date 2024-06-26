/*a  shop will be give discount 10% if the cost of perchased quantity is ore than 1000
 * ask user for quantity 
 * suppose one unit cost 
 * judge and print total cost for user 
  */
  import java.util.Scanner;
public class con3 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("inter quentity");
         int x = s.nextInt();

         if((x*100)>100){
            System.out.println("you get a discount of "+(.1*x*100)+"and your total cost is "+(x*100-(.1*x*100)));

         }else{
            System.out.println("no discount");
         }

        
    }
    
}
