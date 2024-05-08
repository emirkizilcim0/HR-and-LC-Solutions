import java.util.Arrays;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        
        //creating temporary array first.
        int[] scoresTemp = new int[score.length];
        for(int i = 0; i < score.length; i++){
            scoresTemp[i] = score[i];
        }


        Arrays.sort(scoresTemp);
        int left = 0, right = scoresTemp.length - 1;
        while(left <= right){
            int temp = scoresTemp[left];
            scoresTemp[left] = scoresTemp[right];
            scoresTemp[right] = temp;

            left++;
            right--;
        }

        String[] res = new String[score.length];

        int ranking = 1;
        for(int scoreTemp : scoresTemp){
            for(int i = 0; i < score.length; i++){
                if(score[i] == scoreTemp){
                    if(ranking == 1) res[i] = "Gold Medal";
                    else if(ranking == 2) res[i] = "Silver Medal";
                    else if(ranking == 3) res[i] = "Bronze Medal";
                    else res[i] = String.valueOf(ranking);
                }
            }
            ranking++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] scores = {10,3,8,9,4};
        System.out.println(findRelativeRanks(scores));


    }
}
