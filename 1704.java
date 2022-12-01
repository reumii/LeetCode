// 1704. Determine if String Halves Are Alike
class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet();;
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for(char v : vowels) {
			set.add(v);
		}
		
		s = s.toLowerCase();
		int cnt1 = 0;
		int cnt2 = 0;
		int half = s.length()/2;
		for(int i=0; i<half; i++) {
			if(set.contains(s.charAt(i))) cnt1++;
		}
		
		for(int i=half; i<s.length(); i++) {
			if(set.contains(s.charAt(i))) cnt2++;
		}
        return cnt1==cnt2;
    }
}
