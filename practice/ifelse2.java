import java.util.Scanner;
public class ifelse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num a: ");
        int a = sc.nextInt();

        System.out.println("Enter the num b: ");
        int b = sc.nextInt();

        System.out.println("Enter the num c: ");
        int c = sc.nextInt();

        // Corrected if-else conditions
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > c) {  // fixed syntax
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }

        sc.close();  // It's good practice to close the scanner.
    }
}

    

