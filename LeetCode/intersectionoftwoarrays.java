import java.util.ArrayList;
import java.util.Arrays;

public class intersectionoftwoarrays{
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        ArrayList<Integer> intersectionNumbers = new ArrayList<>();

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                intersectionNumbers.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j])
                i++;
            else{
                j++;
            }
        }
        int[] result = new int[intersectionNumbers.size()];
        for(int indx = 0; i < result.length; i++){
            result[indx] = intersectionNumbers.get(indx);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 =  {2,2};
        System.out.println(intersection(nums1,nums2));
    }
}