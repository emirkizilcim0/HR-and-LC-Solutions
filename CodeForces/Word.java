import java.util.Scanner;

public class Word{

    public static String stringConverter(String word){

        String lowerCaseLetters = "qwertyuopasdfghjklizxcvbnm";

        int lowerNum = 0, upperNum = 0;

        for(char letter : word.toCharArray()){
            if(lowerCaseLetters.contains(String.valueOf(letter))){
                lowerNum++;
            }else{
                upperNum++;
            }
        }

        return lowerNum >= upperNum ? word.toLowerCase() : word.toUpperCase();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        System.out.println(stringConverter(word));
        
        sc.close();
    }
}