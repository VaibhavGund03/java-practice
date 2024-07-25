
import java.util.ArrayList;

public class brust {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        // Brute force approach to find the maximum water
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int hgt = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = hgt * width;
                maxWater = Math.max(maxWater, currWater);

                // Remove the return statement here
                // return maxWater; // This line should not be here
            }
        }
        
        // Return the maxWater after completing the loop
        return maxWater; // Corrected: Return statement should be here
    }

    public static void main(String[] Args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        // Call the storeWater function and print the result
        int maxWaterStored = storeWater(height);
        System.out.println("Maximum water that can be stored: " + maxWaterStored);
    }
}
