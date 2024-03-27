import java.util.ArrayList;
import java.util.List;

public class SummaryRanges{
    
    public static String convertToString(int a, int b){
        if(a == b) {return String.valueOf(a);}
        return String.valueOf(a) + "->" + String.valueOf(b);
    }
    
    public static List<String> summaryRanges(int[] nums) {
        if(nums.length == 0){ return new ArrayList<>(); }

        List<String> res = new ArrayList<>();
        List<Integer> range = new ArrayList<>();
        int c = nums[0];

        for(int n : nums){
            if(n == c){
                range.add(n);
                c++;
            }else{
                res.add(convertToString(range.get(0), range.get(range.size() - 1)));
                range.clear();
                range.add(n);
                c = n + 1;
            }
        }

        //last operation for the last element(s).
        res.add(convertToString(range.get(0) , range.get(range.size() - 1)));
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }
}