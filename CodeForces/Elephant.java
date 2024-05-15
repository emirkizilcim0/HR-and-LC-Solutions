import java.util.Scanner;

public class Elephant {
    
    public static int countSteps(int location){
        int steps = 0;
        while (location > 5){
            location -= 5;
            steps++;
        } 

        return location > 0 ? steps + 1 : steps;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int location = sc.nextInt();


        System.out.println(countSteps(location));
        sc.close();
    }
}
