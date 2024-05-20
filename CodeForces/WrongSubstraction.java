import java.util.*;
public class WrongSubstraction {
    
    public static int wrongSubstraction(int number, int numberOfOperations){
        for(int i = 0; i < numberOfOperations; i++){
            if (number % 10 != 0){
                number -= 1;
            }else{
                number /= 10;
            }
        }

        return number;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(wrongSubstraction(n, k));

        sc.close();
    }
}
