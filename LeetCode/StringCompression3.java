public class StringCompression3 {
    public static String compressedString(String word) {
        StringBuilder result = new StringBuilder();
   
        int i = 0, iCheck = 1;
        int letterCounter = 1;
        while(iCheck < word.length()){

            if(word.charAt(i) == word.charAt(iCheck)){
                letterCounter++;
                iCheck++;
            }else{
                while(letterCounter > 9){
                    result.append("9");
                    result.append(word.charAt(i)); 
                    letterCounter -= 9;   
                }
                result.append(String.valueOf(letterCounter));
                result.append(word.charAt(i));
                i = iCheck;
                iCheck++;
                letterCounter = 1;
                
            }

        }

        while(letterCounter > 9){
            result.append("9");
            result.append(word.charAt(i)); 
            letterCounter -= 9;   
        }
        result.append(String.valueOf(letterCounter));
        result.append(word.charAt(i));

        return result.toString();

    }
    
    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";
        System.out.println(compressedString(word));   
    }
}
