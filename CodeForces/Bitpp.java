import java.util.Scanner;

public class Bitpp {

    public static int bitCalculator(String[] bits){
        int result = 0;
        for(String bit : bits){
            if(bit.charAt(1) == '+'){
                result++;
            }else if(bit.charAt(1) == '-'){
                result--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        
        String[] bits = new String[loop];

        for(int i = 0; i < loop; i++){
            String bit = sc.next();
            bits[i] = bit;
        }

        System.out.println(bitCalculator(bits));
        sc.close();
    }
}
