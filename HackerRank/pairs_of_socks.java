import java.util.*;
class pair_of_socks{

    public static int sockMerchant(int n, ArrayList<Integer> ar) {
        // Write your code here
            int res = 0;
            
            HashMap<Integer, Integer> counts = new HashMap<>();
            
            for(int value: ar){
                if(!counts.containsValue(value)) 
                    counts.put(value, 0);
                counts.put(value, counts.get(value) + 1);
            }
            ArrayList<Integer> keys = new ArrayList<>();
            Collections.sort(ar);
            for(int i = 1; i < ar.size(); i++){
                if(ar.get(i-1) != ar.get(i))
                    keys.add(ar.get(i-1));
            }
            ArrayList<Integer> values = new ArrayList<>();
            for(int key : keys){
                values.add(counts.get(key));
            }
            for(int value : values){
                if(value >= 2) 
                res += res/2; 
            }
                
            return res;
        }

    public static void main(String[] args){
        List<Integer> ar = new ArrayList<>();
    }

}