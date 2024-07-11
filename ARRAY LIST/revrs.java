// print reverse of array

// in this program to reverse string by using loop and get operator.

import java.util.ArrayList;

public class revrs {
    public static void main(String[]args){
        ArrayList<Integer>list1 =new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(11);
        list1.add(12);

        // reverse arraylist
        for(int i=list1.size()-1;i>=0;i--){
            System.out.println(list1.get(i));
        }

    }
}
