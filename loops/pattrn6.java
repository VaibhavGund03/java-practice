// print character pattern

public class pattrn6 {
    public static void main (String args[]){
        int n =5;
        char ch = 'A';
        for(int line =1;line<=n;line++){
            for(int chr =1;chr<=line;chr++){
              
                System.out.print(ch);
               ch++;
            }
            System.out.println();
        }
    }
    
}
