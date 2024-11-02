import java.util.ArrayList;

public class ReverseStringII {
    
    public static String reverseStr(String s, int k) {
        
        ArrayList<String> groups = new ArrayList<>();
        String temp = "";

        for(int i = 0; i < s.length(); i++){

            if(temp.length() % k == 0 && temp.length() != 0){
                groups.add(temp);
                temp = String.valueOf(s.charAt(i));
            }
            else{
                temp += String.valueOf(s.charAt(i));
            }

        }

        if(temp.length() != 0){
            groups.add(temp);
        }

        //debugging
        System.out.println(groups.toString());
        
        
        
        StringBuilder result = new StringBuilder();
        boolean reverse = true;
        for(int i = 0; i < groups.size(); i++){
            if(reverse){
                for(int j = groups.get(i).length() - 1; j >= 0; j--){
                    result.append((groups.get(i)).charAt(j));
                }
                reverse = false;
            }else{
                result.append(groups.get(i));
            }
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        
        String s = "abcdefg";
        int k = 2;

        System.out.println(reverseStr(s, k));


    }
}
