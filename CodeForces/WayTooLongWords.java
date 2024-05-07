import java.util.*;
public class WayTooLongWords {
    
    public static String calculator(String word){
        if(word.length() <= 10){
            return word;
        }else{
            return String.valueOf(word.charAt(0)) + String.valueOf(word.length() - 2) + String.valueOf(word.charAt(word.length() - 1));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for(int i = 0; i < loop; i++){
            String word = sc.next();
            System.out.println(calculator(word));
        } 
        sc.close();
    }
}
