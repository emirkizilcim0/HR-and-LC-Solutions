import java.util.Scanner;

public class Team{
    
    public static boolean helper(int[] solutions){
        int accepted = 0;
        for(int solution : solutions){
            if(solution == 1){
                accepted++;
            }
        }

        return accepted >= 2 ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] solutions = new int[3];
        boolean isEnough;
        int res = 0;


        for(int i = 0; i < testCases; i++){
            for(int j = 0; j < 3; j++){
                solutions[j] = sc.nextInt();
            }    
            isEnough = helper(solutions);

            if(isEnough){
                res++;
            }
        } 
        sc.close();
        System.out.println(res);
    }
}