// 520. Detect Capital
class Solution {
    public boolean detectCapitalUse(String word) {
		if(isCapital(word.charAt(0)) && word.length()>1 && isCapital(word.charAt(1))) {
			for(int i=2; i<word.length(); i++) {
				if(!isCapital(word.charAt(i))) return false;
			}
		} else {
			for(int i=1; i<word.length(); i++) {
				if(isCapital(word.charAt(i))) return false;
			}
		}
        return true;
    }

	public boolean isCapital (char c) {
		if('A' <= c && c <= 'Z') return true;
		else return false;
	}
}
