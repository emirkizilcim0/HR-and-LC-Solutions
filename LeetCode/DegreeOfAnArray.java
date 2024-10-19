import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class DegreeOfAnArray {
    public static int findShortestSubArray(int[] nums) {
        
        //finding how many times repeated.
        HashMap<Integer, Integer> counts = new HashMap<>();
        for(int num: nums){
            if(!counts.containsKey(num)){
                counts.put(num, 0);
            }

            counts.put(num, counts.get(num) + 1);
        }

        //finding the most repeated.
        Collection<Integer> values = counts.values();
        int max = 0;
        for(int value : values){
            max = Math.max(value, max);
        }
        System.out.println("max value = " + max);
        
        //finding the key
        List<Integer> possibleKeys = new ArrayList<>();
        for(int num : nums){
            if(counts.get(num) == max){
                possibleKeys.add(num);
            }
        }
 
        
        int left = 0, right = nums.length - 1;
        int maxLength = 0;
        //finding the starting and ending point.
    

        boolean leftFound = true, rightFound = true;
        while( (left < right) && (leftFound || rightFound)){
            if(nums[left] != keyWanted) left++;
            else  leftFound = false;
            if(nums[right] != keyWanted) right--;
            else rightFound = false;
        }
       
        
        

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,3,1};
        
        System.out.println(findShortestSubArray(nums));
        
    }
}
