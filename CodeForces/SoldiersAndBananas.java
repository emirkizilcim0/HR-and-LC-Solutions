import java.util.Scanner;

public class SoldiersAndBananas {
    
    public static int helper(int costOfBanana, int money, int neededBanana){

        int holdBanana = 0;
        int actualMoney = 0;
        int i = 1;
        while(holdBanana < neededBanana){
            holdBanana += 1;
            actualMoney += costOfBanana * i;
            i++;
        }

        return actualMoney > money ? actualMoney - money : 0;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(), n = sc.nextInt(), w = sc.nextInt();
        System.out.println(helper(k,n,w));
        sc.close();
    }
}
