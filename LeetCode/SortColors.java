public class SortColors {
    
    public void sortColors(int[] nums) {
        
        int zeros = 0, ones = 0, twos = 0;
        for(int num : nums){
            if(num == 0) zeros++;
            else if(num == 1) ones++;
            else if(num == 2) twos++;
        }
        int index = 0;
        while(zeros + ones + twos != 0){
            if(zeros > 0){
                nums[index] = 0;
                index++;
                zeros--;
                continue;
            }
            if(ones > 0){
                nums[index] = 1;
                index++;
                ones--;
                continue;
            }
            if(twos > 0){
                nums[index] = 2;
                index++;
                twos--;
                continue;
            }
        }
        
    }
    public static void main(String[] args) {
        SortColors sc = new SortColors();

        int[] ex1 = {2,0,2,1,1,0};
        sc.sortColors(ex1);
    }
}
