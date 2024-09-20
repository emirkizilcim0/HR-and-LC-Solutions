import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortanArray {
    
    //O(n^2);
    public static int[] sortArray(int[] nums) {

        HashMap<Integer, Integer> counts = new HashMap<>();

        for(int num : nums){
            
            if(!counts.containsKey(num)){
                counts.put(num , 0);
            }
            counts.put(num , counts.get(num) + 1);

        }

        List<Integer> keyList = new ArrayList<>(counts.keySet());
        int minNum = Collections.min(keyList);
        int maxNum = Collections.max(keyList);
        
        List<Integer> resList = new ArrayList<>();

        for(int i = minNum; i <= maxNum; i++){
            if(keyList.contains(i)){
                for(int j = 0; j < counts.get(i); j++){
                    resList.add(i);
                }    
            }
        }

        int[] res = new int[resList.size()];
        for(int i = 0; i < resList.size(); i++){
            res[i] = resList.get(i);
        }

        return res;
    }

    //O(n+k)
    public static int[] sortArray2(int[] nums) {

        int min = nums[0], max = nums[0];
        for(int num : nums){
            min = Math.min(num , min);
            max = Math.max(num , max);
        }

        int size = max - min;
        int[] counts = new int[size + 1];

        for(int num : nums){
            counts[num - min]++;
        }

        int index = 0;

        for(int i = 0; i <= size; i++){
            while (counts[i] > 0){
                nums[index] = min;
                index++;
                counts[i]--;
            }

            min++;
        }

        return nums;

    }
    
    public static void main(String[] args) {
        int[] test1 = {5,1,1,2,0,0};
        
        System.out.println(sortArray(test1));

    }
}
