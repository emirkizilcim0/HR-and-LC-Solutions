import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replace(".", " ").replace("!", " ").replace("'", " ").replace(",", " ").replace(";", " ").replace(".", " ").replace("  ", " ").replace("   ", " ");

        String[] words = paragraph.split(" "); 
        HashMap<String , Integer> counts = new HashMap<>();
        for(String word : words){
            boolean isBannedWord = false;
            for(String bannedWord : banned){
                if(bannedWord.equals(word)){
                    isBannedWord = true;
                    break;
                }
            }
            
            if(isBannedWord){
                continue;
            }
            
            if(!counts.containsKey(word.toLowerCase())){
                counts.put(word.toLowerCase(), 0);
            }
            counts.put(word.toLowerCase(), counts.get(word.toLowerCase()) + 1);
        }
        
        System.out.println(counts);
        Collection<Integer> values = counts.values();
        Set<String> keys = counts.keySet();

        int maxValue = Collections.max(values);
        for(String key : keys){
            if(counts.get(key) == maxValue){
                return key;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};
        MostCommonWord mcw = new MostCommonWord();
        System.out.println(mcw.mostCommonWord(paragraph, banned));

    }
}
