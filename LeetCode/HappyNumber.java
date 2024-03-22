public class HappyNumber {
    
    public static boolean isHappy(int n) {
        String n_str = Integer.toString(n);
        int loopCounter = 0;
        while(true){
            int summation = 0;
            if(loopCounter == 998)
                return false;
            
            
            for(char digit : n_str.toCharArray()){
                summation += (int)Math.pow(Character.getNumericValue(digit),2);
            }            
            
            
            if(summation == 1)
                break;
            else{
                n_str = Integer.toString(summation);
            }
            
            
            loopCounter++;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
