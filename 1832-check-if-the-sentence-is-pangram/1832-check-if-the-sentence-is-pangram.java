class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i=97; i<=122; i++) {
        	if(sentence.indexOf(i) < 0) {
        		return false;
        	}
        }
        return true;
    }
}