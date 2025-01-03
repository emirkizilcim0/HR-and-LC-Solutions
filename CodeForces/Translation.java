import java.util.Scanner;

public class Translation{
    
    public static boolean isMatched(String x, String y){

        if(x.length() != y.length()) return false;
        
        for(int i = 0, j = y.length() - 1; i < x.length(); i++, j--){
            if(x.charAt(i) != y.charAt(j)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        

        if(isMatched(word1, word2)) System.out.println("YES");
        else System.out.println("NO");

        sc.close();

    }
}
