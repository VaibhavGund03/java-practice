import java.util.*;
public class multidimen1 {
    public static void main(String[]args){
        ArrayList<ArrayList<Character>> mainlist =new ArrayList<>();

      ArrayList <Character>list1 = new ArrayList<>();
        list1.add('A');
        list1.add('B');
        list1.add('C');
        list1.add('D');
        list1.add('E');
        list1.add('F');
        mainlist.add(list1);


        ArrayList<Character>list2 = new ArrayList<>();
        list2.add('a');
        list2.add('b');
        list2.add('c');
        list2.add('d');
        list2.add('e');
        list2.add('f');
        mainlist.add(list2);

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Character> currlist =mainlist.get(i);
            for(int j =0;j<currlist.size();j++){

                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);

    }
}
