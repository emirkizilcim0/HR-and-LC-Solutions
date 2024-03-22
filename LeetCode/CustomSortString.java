import java.util.*;

public class CustomSortString{
    
    public static String customSortString(String order, String s){
        HashMap<Character, Integer> counts = new HashMap<>();
        for(char letter: s.toCharArray() ){
            if(!counts.containsKey(letter)){
                counts.put(letter, 0);
            }
            counts.put(letter, counts.get(letter) + 1);
        }
        
        String res = "";
        for(Character letter : order.toCharArray()){
            if(s.contains(String.valueOf(letter))){
                while(counts.get(letter) != 0){
                    res += letter;
                    counts.put(letter,counts.get(letter)-1);
                }
                if(counts.get(letter) == 0){
                    counts.remove(letter);
                }
            }
        }

        Set<Character> lastKeys = counts.keySet();
        List<Character> lastKeys_List = new ArrayList<>(lastKeys);
        for(int i = 0; i < lastKeys_List.size(); i++){
            while(counts.get(lastKeys_List.get(i)) != 0){
                res += String.valueOf(lastKeys_List.get(i));
                counts.put(lastKeys_List.get(i) , counts.get(lastKeys_List.get(i)) - 1);
            }
        }

        return res;
    }
    
    public static void main(String[] args){
        
        System.out.println(customSortString("cba", "abcd"));
    }
}