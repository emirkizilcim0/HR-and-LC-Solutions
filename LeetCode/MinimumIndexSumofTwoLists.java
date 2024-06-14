import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists{
    
    public static  String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String, Integer> list1Indexes = new HashMap<>();
        Map<String , Integer> list2Indexes = new HashMap<>();

        for(int i = 0 ; i < list1.length; i++){
            if(!list1Indexes.containsKey(list1[i])){
                list1Indexes.put(list1[i], i);
            }
        }

        for(int i = 0 ; i < list2.length; i++){
            if(!list2Indexes.containsKey(list2[i])){
                list2Indexes.put(list2[i], i);
            }
        }

        //adding common words.
        List<String> commonWords = new ArrayList<>();
        List<Integer> totalIndexes = new ArrayList<>();
        
        int minIndexVal = Integer.MAX_VALUE;
        
        
        for(String word1 : list1){
            List<String> list2copy = Arrays.asList(list2);
            if(list2copy.contains(word1)){
                commonWords.add(word1);
            }
        }

        for(int i = 0; i < commonWords.size(); i++){
            int indexSum = list1Indexes.get(commonWords.get(i)) + list2Indexes.get(commonWords.get(i));
            minIndexVal = Math.min(indexSum, minIndexVal);

            totalIndexes.add(indexSum);
        }
        
        List<String> res = new ArrayList<>();
        for(int i = 0; i < totalIndexes.size(); i++){
            if(totalIndexes.get(i) == minIndexVal){
                res.add(commonWords.get(i));
            }
        }

        String[] result = new String[res.size()];

        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        

        return result;
    }
    
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        
        System.out.println(findRestaurant(list1, list2));


    }
}