
public class linear1 {
    public static void main (String[]args) {
        int []arr = {12,11,13,14,15,16,29,17,100,1,5};
        int target = 100;
        int ans = linearsearch(arr,target);
        System.out.println(ans);
    }
    // search in the array: return the index if item found.
    // otherwise if item not found return -1;

    static int linearsearch(int[]arr,int target){
        if(arr.length ==0){
            return -1;

        }
        // run a loop
        for (int index =0; index<arr.length;index++){

            //  check for element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return index;

            }
        }
        // this line will be exicute if non of the return statement above have exicuted 
        // hence the target non found.
        return -1;
    }
    
}
