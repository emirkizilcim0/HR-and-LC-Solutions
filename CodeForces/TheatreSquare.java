import java.util.*;
import java.math.BigInteger;

public class TheatreSquare {
    
    public static BigInteger neededFlag(int m, int n, int a){
        BigInteger M = new BigInteger(String.valueOf(m));
        BigInteger N = new BigInteger(String.valueOf(n));
        BigInteger A = new BigInteger(String.valueOf(a));
        
        BigInteger res1 = new BigInteger("0");
        BigInteger res2 = new BigInteger("0");

        BigInteger firstPart = res1.add(M).add(A).subtract(BigInteger.ONE).divide(A);
        BigInteger secondPart = res2.add(N).add(A).subtract(BigInteger.ONE).divide(A); 

        return firstPart.multiply(secondPart);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();

        System.out.println(neededFlag(m, n, a));

        sc.close();
        
    }
}
