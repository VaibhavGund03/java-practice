/* */
import java.util.ArrayList;
import java .util.Collections;
public class sorting {
    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(10);
        System.out.println(list);
        Collections.sort(list); 
        // to print the array sort in assending order 
        System.out.println(list+"\n\n\n");

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
    
}
