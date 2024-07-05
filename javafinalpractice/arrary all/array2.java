// write a javsas program to sort a numberi array and a string array

// import the necessary class from the java utility library 

import java.lang.reflect.Array;
import java.util.Arrays;

public class array2 {

    public static void main(String[]args){
        // declare a and allocate array
        int[] arr1 ={12,11,13,14,44,5,66,76,665,44,22};
         
        //declare and initialize a stirng array
        String[] arr2 ={
            "java",
            "python",
            "c++",
            "c programmnig",
            "flutter",
            "javascript"
            
        };
        // pripnt the original numeric array.
        System.out.println("original numberic array"+Arrays.toString(arr1)+"\n");



        // sort the numeric array in ascending order.
Arrays.sort(arr1);
// print 

System.out.println("sorted numeric array  = "+Arrays.toString(arr1)+"\n");

// print the original string array
System.out.println("print the original string array"+Arrays.toString(arr2));

// sort the string array in lexicographical (alphabetical) order.

Arrays.sort(arr2);

// print the sorted atring array
System.out.println("print sorted string array"+Arrays.toString(arr2));
    }


    
}
