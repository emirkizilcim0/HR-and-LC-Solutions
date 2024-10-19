public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        
        if(a.contains(b) && b.contains(a)) return - 1;
        if(a.length() != b.length()) return a.length() > b.length() ? a.length() : b.length();
        
        int left = 0, right = a.length() - 1;

        while( left < right ){

            if(a.charAt(left) != b.charAt(left) || a.charAt(right) != b.charAt(left)){
                return right - left + 1;
            }else{
                left++;
                right--;
            }
        }

        return -1;
        
    }

    public static void main(String[] args) {
        String a = "aweffwaf";
        String b = "aweffwaf";

        LongestUncommonSubsequenceI obj = new LongestUncommonSubsequenceI();

        System.out.println(obj.findLUSlength(a,b));
    }
}
