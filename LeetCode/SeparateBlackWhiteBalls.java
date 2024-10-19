import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeparateBlackWhiteBalls {
    
    public static boolean isAllZero(List<Character> s, long success){

        for(int i = 0; i < success; i++){
            if(s.get(i) == '1'){
                return false;
            }
        }
        return true;
    }
    
    public static long minimumSteps(String s) {
        
        long result = 0;
        long ones = 0;
        List<Character> chars = new ArrayList<>();
        for(Character chr : s.toCharArray()){
            if(chr == '1') ones++;
            
            chars.add(chr);
        }

        long success = s.length() - ones; 
        
        while(!isAllZero(chars, success)){
            
            for(int i = 0; i < chars.size()-1; i++){

                if(chars.get(i) == '1' && chars.get(i+1) == '0'){
                    Collections.swap(chars, i, i + 1);
                    result++;
                }
            }
            
        }

        return result;
    }
    
    public static void main(String[] args) {

        String s = "0111";

        System.out.println(minimumSteps(s));
    }
}
