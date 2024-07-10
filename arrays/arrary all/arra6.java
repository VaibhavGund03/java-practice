//LINER SEARCH 

// find the index of element in a given array  2,4,6,8,10,12,14,16; key =10;

// find the element in the array

import java.util.Scanner;

public class arra6 {
    public static int linearSearch(int numbers[] , int key ){
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        // tey do not find any search key after that they provid a -1;

return -1;
    }
    // main function

    public static void main(String args[]){
        int numbers [] ={2,4,6,8,10,12,14,16};

        int key =10;// key
        int index =  linearSearch(numbers,key); // call by function
         
        System.out.println("key is at index = "+index);
    }
    }

    

