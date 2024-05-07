import java.util.*;

public class BeautifulMatrix{
    
    public static int minMoveNeeded(List<List<Integer>> matrix){
        int i = 0, j = 0;
        int result = 0;
        boolean isFound = false;
        
        for(i = 0; i < matrix.size(); i++){
            for(j = 0; j < matrix.get(0).size(); j++){
                if(matrix.get(i).get(j) == 1){
                    isFound = true;
                    break;
                }
            }
            if(isFound){
                break;
            }
        }

        result = Math.abs(i - 2) + Math.abs(j - 2);
        
        return result;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> matrix = new ArrayList<>();
        
        for(int i = 0; i < 5; i++){
            List<Integer> tempMatrix = new ArrayList<>();
            for(int j = 0; j < 5; j++){
                int num = sc.nextInt();
                tempMatrix.add(num);
            }
            matrix.add(tempMatrix);
        }

        System.out.println(minMoveNeeded(matrix));
        
        sc.close();
    }
}