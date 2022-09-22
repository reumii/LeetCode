class Solution {
    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strList = s.split(" ");
        
        for(String str : strList) {
        	for(int i=str.length()-1; i>=0; i--) {
        		answer.append(str.charAt(i));
        	}
        	answer.append(" ");
        }
        return answer.substring(0,s.length()).toString();
    }
}