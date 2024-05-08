import java.util.Scanner;

public class PetyaAndStrings {
    
    public static int comparison(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        for(int i = 0; i < s1.length(); i++){

            
            int ascii1 = s1.charAt(i);
            int ascii2 = s2.charAt(i);
            if(ascii1 < ascii2){
                return -1;
            }
            if(ascii1 > ascii2){
                return 1;
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(comparison(s1, s2));
        
        sc.close();
    }
}
