import java.util.ArrayList;

public class MaximumSumofDistinctSubarraysWithLengthK {
    
    public static long maximumSubarraySum(int[] nums, int k) {
        
        long maxResult = 0;
        int left = 0, right = k - 1;
        int length = nums.length;

        while(right < length){

            long summation = 0;
            ArrayList<Integer> tempArray = new ArrayList<>();
            for(int i = left; i < right + 1; i++){
                if(tempArray.contains(nums[i])){
                    break;
                }
                tempArray.add(nums[i]); 
                //System.out.println(tempArray.toString());
            }

            if(tempArray.size() == 3){
                for(int num : tempArray){
                    summation += num;
                }
            }
            
            
            //System.out.println(summation);
            maxResult = (long)Math.max(maxResult, summation);
            left++;
            right++;
            
        }

        return maxResult;
    }    
    public static void main(String[] args) {
        
        int[] array = {1,3,3,3,3,2,1,3,1,1,2};
        int k = 3;

        System.out.println(maximumSubarraySum(array, k)); //15

    }
}
