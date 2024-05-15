import java.util.Scanner;

public class AStringTask {
    
    public static String modifiyString(String word){
        word = word.toLowerCase();
        String res = "";
        String vowels = "aeiuoy";
        boolean wanted = false;
        
        for(char letter : word.toCharArray()){
            int success = 0;
            for(char vowel : vowels.toCharArray()){
                if(letter == vowel){
                    break;
                }else success++;

                if(success == vowels.length()) wanted = true;
            }    
            if(wanted == true){
                res += "." + String.valueOf(letter);
                wanted = false;
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        System.out.println(modifiyString(word));
        
        sc.close();
    }
}
