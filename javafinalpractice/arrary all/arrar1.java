// aarray are stored in contiguous memory {consecutive memory location}.

import java.util.Scanner;

public class arrar1 {
public static void main(String[] args) {

  int age[] = new int[5];// declaration and allocaation

 // gives the value 
  age[0] = 1;
  age[1] = 2;
  age[2] = 3;
  // print the values on output section
   System.out.println(age[2]);
   System.out.println(age[1]);
   System.out.println(age[0]+"\n");
   System.out.println("array size is = "+age.length);// print the length
   int marks[] ={89,76,88,77,67,57,77,65};
   System.out.println(marks[1]);
   System.out.println(marks[0]+marks[1]+marks[2]);

}

    
}
