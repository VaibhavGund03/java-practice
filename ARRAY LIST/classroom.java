
//---- array list is a inbult data structure in java.

// linear structure.

/* array ==

 -- fixed size 
 -- primitive data type can stored

 arraylist ==
 
 --dynamic size 
--vprimitive data type cant be store directly

 */

import java.util.ArrayList;  // only sue for array list.

// import java.util.*;  // acess all type class 
//
public class classroom{
    public static void main (String[]args){
     // arraylist <datatype> arraylist name
     
     ArrayList <Integer>list = new ArrayList<>(); // call the constructure.
     ArrayList<String>list2 = new ArrayList<>(); 

     ArrayList<Boolean>list3 = new ArrayList<>(); 
     // ArrayList work like Vector in 


//OPERATION IN JAVA
/*
 add element   time complexity 0(1)
 
 get element                   0(1)

 remove element               0(1)

 set element at index         0(n)

 contains element             0(n)



 */

//ADD ELEMENT

list.add(1);
list.add(2);
list.add (3);
System.out.println(list+"\n");  // add a element in a array list.


list2.add("vaibhav");
list2.add("bhausaheb");
list2.add("gund");

System.out.println(list2+"\n");

list3.add(true);
System.out.println(list3+"\n");

System.out.println("ADD OPERATER END");


// or for add element

list.add(1,3);  // it works same as add but add on specific index.


//GET ELEMENT

list.get(0); // it use to show the elemnet by perticular index

list.get(2);
System.out.println(list+"\n");

list2.get(0);
System.out.println(list2+"\n");

System.out.println("GET OPERATER END");

// REMOVE ELEMENT /delete 


list.remove(0);  // delete a number on perticular index
list2.remove(0);

System.out.println(list+"\n");
System.out.println(list2+"\n");
System.out.println();
System.out.println("REMOVE OPERATOR END");

// SET ELEMENT  at index


list.set(1,10); // update or add a elemet on perticular index
list.set(0,12);
System.out.println(list);


list2.set(0,"v");
list2.set(1,"o");
System.out.println(list2);

System.out.println("SET OPERATOR END");


//CONTAIN OPERATIOR or elememt 
System.out.println(list.contains(10));
System.out.println(list2.contains("ram")); // it check the element are present in array list or not . answer is yes it give true and answer is not it gives false.

    
// size of AL array list

System.out.println(list.size()+"\n"); // print the size of array

// print the array list by using ..size
for(int i=0 ; i<list.size();i++){
    System.out.println(list.get(i));
}


     }


    
}
