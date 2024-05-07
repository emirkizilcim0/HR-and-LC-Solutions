import java.util.*;

public class NextRound {
    
    public static int countAdvencers(int[] candidates, int k){

        int result = 0;
        for(int i = 0; i < candidates.length; i++){
            if(candidates[i] >= candidates[k-1] && candidates[i] > 0){
                result++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candidates = new int[n];

        for(int i = 0; i < n ; i++){
            int score = sc.nextInt();
            candidates[i] = score;
        }

        System.out.println(countAdvencers(candidates, k));
        sc.close();
    }
}
