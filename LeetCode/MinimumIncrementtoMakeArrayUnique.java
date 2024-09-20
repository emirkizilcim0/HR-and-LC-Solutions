import java.util.Arrays;

public class MinimumIncrementtoMakeArrayUnique {
    public static int minIncrementForUnique(int[] nums) {
        
        int moves = 0;
        Arrays.sort(nums);

        while(true){
            int success = 0;
            for(int num : nums){
                System.out.print(num + " ");
            }
            System.out.println();
            for(int i = 1; i < nums.length; i++){
                if(nums[i-1] == nums[i]){
                    nums[i] += 1; 
                    moves++;
                    Arrays.sort(nums);
                    break;
                }else{
                    success++;
                }
            }


            if(success == nums.length - 1){
                break;
            }
        }

        return moves;

    }
    
    public static void main(String[] args) {
        int[] nums = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(nums));
    }
}
