import java.util.*;
public class DeadFish {
    public static int[] parse(String data) {
        // Implement me! :)
        ArrayList<Integer> numbers = new ArrayList<>();
        int initialVal = 0;
        for(char cmd : data.toCharArray()){
          if(cmd == 'i'){
            initialVal += 1;
          }else if(cmd == 'd'){
            initialVal -= 1;
          }else if(cmd == 's'){
            initialVal = (int)Math.pow(initialVal, 2);
          }else if(cmd == 'o'){
            numbers.add(initialVal);      
          }
        }
        
        int [] res = new int[numbers.size()];
        for(int i = 0; i < numbers.size(); i++){
          res[i] = numbers.get(i);
        }
      return res;
    }

    public static void main(String[] args) {
        String data = "iiisdoso";
        System.out.println(parse(data));
    }
}