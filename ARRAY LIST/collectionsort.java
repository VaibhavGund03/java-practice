// collection sort arraylist.

import java.util.ArrayList;

import java.util.Collections;

public class collectionsort {
    public static void index(ArrayList<Integer>list,int idx1,int idx2){
        int temp = list.get(idx2);
        list.set(idx1,list.get(idx2));
        list.set(idx2,list.get(idx1));
        list.set(idx2,temp);

    }
    public static void main (String 
    args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(1);
        list.add(6);
       
        Collections.sort(list);
    }
    
}
