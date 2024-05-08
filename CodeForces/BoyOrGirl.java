import java.util.*;

public class BoyOrGirl {
    
    public static String declaration(String id){
        HashMap<String, Integer> counts = new HashMap<>();
        for(char ch : id.toCharArray()){
            if(!counts.containsKey(String.valueOf(ch))){
                counts.put(String.valueOf(ch), 0);
            }
            counts.put(String.valueOf(ch), counts.get(String.valueOf(ch)) + 1);
        }
        
        if(counts.keySet().size() % 2 == 0){
            return "CHAT WITH HER!";
        }else{
            return "IGNORE HIM!";
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        
        System.out.println(declaration(id));
        
        sc.close();
    }
}
