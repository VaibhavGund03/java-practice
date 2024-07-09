// by passing array as argument
import java.util.*;

public class arra5 {
    public static void update(int marks[], int nonChangable){
        nonChangable = 90;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }

    }
    public static void main(String args[]){
        int nonChangable= 89;
        int marks[]={87,88,98};
        update(marks,nonChangable);
    System.out.println("nonChangamble "+nonChangable);
        // print marks
    for(int i =0; i<marks.length;i++){
        System.out.println(marks[i]+" ");

    }
    System.out.println();


    }
    
}
