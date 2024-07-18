// a java program to demonstrate working of list remove when object to be romoved is passed

// boolean remove(object obj)
/* it accept object that remove it return true if it ifnds and removes the element it return the false if statement to be remove is not present*/

import java.util.*;


public class removemethos {
    public static void main (String[]args){
        // demonstrating remove on arraylist

        List<String> myAlist = new ArrayList<String>();
        myAlist.add("Veb's ");
        myAlist.add("java ");
        myAlist.add("content");
        System.out.println("original arraylist : "+ myAlist);

        // remove method are use to remove a string specific content
        myAlist.remove("content");
        
        System.out.println("modifide arraylist : "+myAlist);

        // demonstrate remove on linkedlist.

        List<String> myLlist = new LinkedList<String>();

        myLlist.add("Veb's ");
        myLlist.add("java");
        myLlist.add("content ");
  
    System.out.println("original linklist"+myLlist);

    myLlist.remove("java");

    System.out.println("modified linkList"+myLlist);


    }
    
}
