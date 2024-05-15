import java.util.Scanner;

public class StonesOnTheTable {
    
    public static int numberOfMovements(String stones){
        int i = 1;
        int removal = 0;
        while(i < stones.length()){
            if(stones.charAt(i-1) == stones.charAt(i)){
                removal++;
                i++;
                continue;
            }
            i++;
        }        

        return removal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        String stones = sc.next();  


        System.out.println(numberOfMovements(stones));
        sc.close();
    }
}
