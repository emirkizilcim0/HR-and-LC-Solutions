import java.util.Scanner;

public class WordCapitalization {
    
    public static String capitalization(String word){
        
        if(String.valueOf(word.charAt(0)).toUpperCase() == String.valueOf(word.charAt(0))) return word;
        else return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1, word.length()); 

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(capitalization(word));

        sc.close();
        
    }
}
