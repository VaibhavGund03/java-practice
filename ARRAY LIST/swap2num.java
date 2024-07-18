// swap two numbers  list = 2,,5,9,3,6. index = idx1=1,idx2=3

import java.util.*;
public class swap2num {
    public static void swap(  ArrayList<Integer> list , int idx1,int idx2){
        int temp =list.get(idx1);

        list.set(idx1,list.get(idx2));
       list.set(idx2,list.get(idx1));
       



    }
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int idx1 =1,idx2=3;
        System.out.println(list);

        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
