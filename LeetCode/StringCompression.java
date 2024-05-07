import java.util.HashMap;
import java.util.Set;
public class StringCompression extends SummaryRanges {
    

    public static int compress(Character[] chars) {
        String res = "";
        HashMap<String, Integer> counts = new HashMap<>();
        for(Character c : chars){
            if(!counts.containsKey(String.valueOf(c))){
                counts.put(String.valueOf(c), 0);
            }
            counts.put(String.valueOf(c), counts.get(String.valueOf(c)) + 1);
        }
        Set<String> keys = counts.keySet();
        //Collection<Integer> values = counts.values(); 
        for(String key : keys){
            if(counts.get(key) == 1){
                res += key;
            }else{
                res += key + String.valueOf(counts.get(key)); 
            }
        }
        System.out.println(res);
        return res.length();
    }
    
    public static void main(String[] args) {
        Character[] ch = {'a','b','b'};
        System.out.println(compress(ch));
    }
}
