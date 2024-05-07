import java.util.Scanner;

public class AWaterMelon{

    public static String check(int number){
        if(number == 2){
            return "NO";
        }
        if(number <= 100 || number >= 0){
            if( number % 2 != 0){
                return "NO";
            }else{
                return "YES";
            }
        }else{
            return "NO";
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int waterMelonNum = sc.nextInt();
        
        System.out.println(check(waterMelonNum));
        sc.close();
    }
}