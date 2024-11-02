import java.util.HashMap;
import java.util.Set;

public class LongPressedName {
    
    public static boolean isLongPressedName(String name, String typed) {
        HashMap<Character, Integer> countsName = new HashMap<>();
        HashMap<Character, Integer> countsTyped = new HashMap<>();
        
        //saving chacaters
        for(char ch : name.toCharArray()){
            if(!countsName.containsKey(ch)){
                countsName.put(ch, 0);
            }
            countsName.put(ch, countsName.get(ch) + 1);
        }
        for(char ch : typed.toCharArray()){
            if(!countsTyped.containsKey(ch)){
                countsTyped.put(ch, 0);
            }
            countsTyped.put(ch, countsTyped.get(ch) + 1);
        }
        
        
        Set<Character> ct = countsTyped.keySet();
        
        //if there are different characters, directly false
        for(Character ch : name.toCharArray()){
            if(!ct.contains(ch)) return false;
        }

        //if there are different sized characters which means different character. directly false
        //if((countsName.keySet()).size() != (countsTyped.keySet()).size()) return false;
        

        //checking if the character is less than is should be
        int flagOne = 0;
        for(char ch : name.toCharArray()){
            if(countsName.get(ch) <= countsTyped.get(ch)) flagOne++;
        }
        

        //checking if the string is really it is.
        int flagTwo = 0;
        int leftIndexName = 0, leftIndexTyped = 0;
    
        while(leftIndexName < name.length() && leftIndexTyped < typed.length()){
            
            if(name.charAt(leftIndexName) == typed.charAt(leftIndexTyped)){
                leftIndexName++;
                flagTwo++;
            }
            
            leftIndexTyped++;
        }
        
        //if still it is not end of the string.
        if(leftIndexTyped < typed.length()){
            for(int i = leftIndexTyped; i < typed.length(); i++){
                if(typed.charAt(i) != typed.charAt(leftIndexTyped - 1)) return false;
            }
        }
        
        if(flagTwo == name.length() && flagOne == name.length()) return true;

        return false;

        
    }
    
    
    public static void main(String[] args) {
        String name = "rick";
        String typed = "kric";

        System.out.println(isLongPressedName(name, typed)); //false

        String name1 = "alex";
        String typed1 = "aaleex";

        System.out.println(isLongPressedName(name1, typed1)); //true

        String name2 = "alex";
        String typed2 = "aaleelx";

        System.out.println(isLongPressedName(name2, typed2)); //false


    }
}
