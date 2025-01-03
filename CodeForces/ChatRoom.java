import java.util.Scanner;
import java.util.ArrayList;

public class ChatRoom {
    
    public static String letterReducer(String word){

        ArrayList<Character> notRepeated = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        
        for(char letter : word.toCharArray()){
            if(!notRepeated.contains(letter)){
                notRepeated.add(letter);
                result.append(letter);
            }
        }

        return result.toString();

    }

    public static boolean isMatched(String wantedWord, String input){

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            result.append(input.charAt(i));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wantedWord = "hello";
        String input = sc.nextLine();

        input = letterReducer(input);

        

    }
}
