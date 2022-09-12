class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        
        int score = 0;
        int minToken = 0;
        int maxToken = tokens.length-1;
        int maxScore = 0;
      
        while(minToken <= maxToken){
           if(power >= tokens[minToken]){
               power -= tokens[minToken];
               score++;
               minToken++;
               maxScore = Math.max(maxScore, score);
           }else if(score<1){
               break;
           }else{
               power += tokens[maxToken];
               score--;
               maxToken--;
           }
        }
        
        return maxScore;
    }
}