import java.util.Scanner;

public class while1 {

    public static void main(String[]args){
          // declaration section
           
        int i =3;
        int a = 5;
          // first loop 

        while(a>=0){
            System.out.println(a);
            a--;
        }

        // secon loop

        while(i<3){
            System.out.println(i);
            i++;
        }
        //third loop

        Scanner scanner = new Scanner(System.in); // Correct input handling
        boolean isExit = false;
        System.out.println("Type 'exist' to exit the loop:");
        while (!isExit) {
            String s = scanner.nextLine();
            isExit = s.equals("exist");
        }
        scanner.close(); 
    }

}