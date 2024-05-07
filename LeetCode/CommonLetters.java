import java.util.*;

public class CommonLetters{
    public static List<String> commonChars(String[] words) {
        List<List<String>> letterLists = new ArrayList<>();
        List<String> res = new ArrayList<>();

        for(String word : words){
            List<String> letters = new ArrayList<>();
            for(char chr : word.toCharArray()){
                if(!letters.contains(String.valueOf(chr)))
                    letters.add(String.valueOf(chr)); 
            }
            letterLists.add(letters);
        }
        
        //finding maxSized array
        int maxSize = Integer.MIN_VALUE;
        List<String> maxSizedList = new ArrayList<>();
        for(List<String> letterList : letterLists){
            if(maxSize != Math.max(maxSize, letterList.size())){
                maxSizedList = letterList;
            }
            maxSize = Math.max(maxSize, letterList.size());
        }

        //comparison
        for(String letter : maxSizedList){
            int success = 0;
            for(List<String> letterList : letterLists){
                if(letterList.contains(letter)){
                    success++;
                }               
            }
            if(success == letterLists.size()){
                res.add(letter);
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        String[] words ={"bella","label","roller"};
        System.out.println(commonChars(words));

        String[] words1 ={"cool","lock","cook"};
        System.out.println(commonChars(words1));
    }
}