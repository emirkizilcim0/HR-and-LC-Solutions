import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PickPeaks {


    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        
        
        List<Integer> peaks = new ArrayList<>();  
        List<Integer> pos = new ArrayList<>();
        
        Map<String, List<Integer>> res = new HashMap<>();
        
        boolean isSearchingLocalMax = true;
        
        //first and last elements dont declare anything for finding maxima point.
        //start from second-placed element and check until second element from last.

        for (int i = 2; i < arr.length; i++){
            
            if (arr[i-1] > arr[i] && isSearchingLocalMax){
                
                peaks.add(arr[i-1]);
                
                //checking position
                int streak = 0, j = 0;
                for(j = 0; j < i - 1; j++){
                    if(arr[j] == j){
                        streak++;
                    }else{
                        streak = 1;
                    }
                }
                
                //if there is a streak of the same numbers, gotta take the beginning index.
                if(streak != 1) pos.add(i - streak - 1);
                else pos.add(i - 1);

                isSearchingLocalMax = false;
            }

            if (arr[i-1] < arr[i]){
                isSearchingLocalMax = true;
            }
        }

        res.put("pos" , pos);
        res.put("peaks" , peaks);

        return res;
        
    }

    public static void main(String[] args) {
        int[] arr  = {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3};
        int[] arr2 = {1, 2, 2, 2, 2};
        int[] arr3 = {1, 2, 2, 2, 1};                                       
        int[] arr4 = {1, 2, 2, 2, 3};
        
        
        //test cases:
                System.out.println(getPeaks(arr));  //{pos=[3, 7], peaks=[6, 3]}
                System.out.println(getPeaks(arr2));  //{pos=[], peaks=[]}
                System.out.println(getPeaks(arr3));  //{pos=[1], peaks=[2]}
                System.out.println(getPeaks(arr4));  //{pos=[], peaks=[]}
    }
}