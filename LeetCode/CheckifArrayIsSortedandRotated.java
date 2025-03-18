import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckifArrayIsSortedandRotated {
    
    public static boolean check(int[] nums) {
      
        int smallestNumber = Integer.MAX_VALUE, index = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < smallestNumber){
                smallestNumber = nums[i];
                index = i;
            }
        }

        System.out.println(index + " " + smallestNumber);
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            for(int num: nums){
              arraylist.add(num);
            }
        }

        System.out.println(arraylist.toString());
        ArrayList<Integer> abc = new ArrayList<>();
        for(int i = index; i < nums.length + index; i++){
            abc.add(arraylist.get(i));
        }

        for(int i = 0; i < abc.size() - 1 ; i++){
            if(abc.get(i) > abc.get(i+1)) return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};

        System.out.println(check(nums));
    }
}
