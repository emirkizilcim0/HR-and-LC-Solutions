import java.util.Scanner;

public class DominoPiling{
    
    public static int count(int m, int n){
        final int DOMINO_AREA = 2; 
        int area = m * n;
        
        return area / DOMINO_AREA;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(count(m, n));
        
        sc.close();
    }
}