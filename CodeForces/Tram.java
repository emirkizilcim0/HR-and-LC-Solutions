import java.util.Scanner;

public class Tram {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStops = sc.nextInt();

        int sufficientNumber = 0, currentNumber = 0;
        for(int i = 0; i < numberOfStops; i++){
            int entering = sc.nextInt();
            int leaving = sc.nextInt();
            currentNumber += leaving - entering;
            sufficientNumber = currentNumber > sufficientNumber ? currentNumber : sufficientNumber;
        }

        System.out.println(sufficientNumber);

        sc.close();
    }
}
