public class DeleteCharacterstoMakeFancyString {
    
    public static String makeFancyString(String s) {
        
        int i = 0;
        int iCheck = 1;
        StringBuilder result = new StringBuilder();

        while(i < s.length() && iCheck < s.length()){
            if(s.charAt(i) != s.charAt(iCheck)){
        
                result.append(s.charAt(i));
                i++;
                iCheck++;
            }else{
        
                char repeatedChar = s.charAt(i);
                while(s.charAt(i) == s.charAt(iCheck) && iCheck < s.length() - 1 && i < s.length()){
                    iCheck++;
                }
                for(int a = 0; a < 2; a++){
                    result.append(repeatedChar);
                }
                i = iCheck;
                iCheck++;
            }
            
            System.out.println(result.toString());
            System.out.println(iCheck + " " + i);

        }

        int lastIndex = s.length() - 1;
        if(s.charAt(lastIndex) != s.charAt(lastIndex - 1)) result.append(s.charAt(i));


        return result.toString();

    }
    
    public static void main(String[] args) {
    
        String s = "aabaaaaa";
        System.out.println(makeFancyString(s)); //leetcode

    }
}
