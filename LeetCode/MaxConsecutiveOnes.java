public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int size = nums.length;

        int consecutive = 0;
        int max = 0;
        for(int i = 0; i < size; i++){
            if(nums[i] == 1) consecutive++;
            else{
                max = Math.max(max, consecutive);
                consecutive = 0;
            }
        }
        
        max = Math.max(max , consecutive);

        return max;
    }
}
