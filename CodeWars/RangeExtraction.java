public class RangeExtraction{
    
    public static String solution(int[] arr){

        int windowFront = 0;
        int windowBack = 1;
        //int consecutive = 0;
        while(windowFront < arr.length && windowBack < arr.length){
            if(arr[windowFront] - arr[windowBack] == -1){

            }
            
        }
        return "";
    }
    
    public static void main(String[] args) {
        System.out.println(solution(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }

}