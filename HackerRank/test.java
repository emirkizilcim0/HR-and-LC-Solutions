import java.util.*;
public class test{


    public static int missingNumber(ArrayList<Integer> nums) {
        int limitLeft = Collections.min(nums);
        int limitRight = Collections.max(nums);
        
        return limitLeft;
    }


    public static void main(String[] args){
        //String abc = "merhababenemir";
        //String abc2 = "merhababenemirx";
        //int c1 = 0;
        //for(char c: abc.toCharArray()){
        //    c1 +=(int) c;
        //}
        //
        //int c2 = 0;
        //for(char c: abc2.toCharArray()){
        //    c2 += (int)c;
        //}
//
        //char result =(char)(c2-c1);
        //System.out.println(result);

        ArrayList<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            int val = sc.nextInt();
            array.add(val);
        }
        sc.close();
        System.out.println(missingNumber(array));




    }
}