import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> wordsMatched = new ArrayList<>();
        for(String word : words){
            for(String row : rows){
                int success = 0;
                for(int i = 0; i < word.length(); i++){
                    if(row.contains(String.valueOf(Character.toLowerCase(word.charAt(i))))){
                        success++;
                    }
                }
                if(success == word.length()){
                    wordsMatched.add(word);
                    break;
                }

            }
        }   

        String[] result = new String[wordsMatched.size()];
        for(int i = 0; i < wordsMatched.size(); i++){
            result[i] = wordsMatched.get(i);
        }

        return result;
    }
}
