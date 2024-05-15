import java.util.Scanner;

public class BearAndBigBrother {
    
    public int yearsNeeded(int a, int b){
        int years = 0;
        while(a <= b){
            a *= 3;
            b *= 2;
            years++;
        }

        return years;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt() , bob = sc.nextInt();
        
        BearAndBigBrother obj = new BearAndBigBrother();
        System.out.println(obj.yearsNeeded(limak, bob));

        sc.close();

    }
}
