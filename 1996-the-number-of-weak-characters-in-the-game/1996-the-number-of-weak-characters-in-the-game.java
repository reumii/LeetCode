import java.util.*;
class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(o1, o2)->{
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else{
                return o2[0] - o1[0];
            }
        });
        
        int answer = 0;
        int maxD = properties[0][1];
        for(int i=1; i<properties.length; i++){
            if(maxD > properties[i][1]){
                answer++;
            }else if(maxD < properties[i][1]){
                maxD = properties[i][1];
            }
        }
        
        return answer;
    }
}