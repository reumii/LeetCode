class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap();
		int answer = 0;
		for(String word : words) {			
			if(map.containsKey(word)) {
				int cnt = map.getOrDefault(word, 0)-1;
				if(cnt <= 0) map.remove(word); 
				else map.put(word, cnt);
				answer += 4;
			}else {
				word = Character.toString(word.charAt(1)) + word.charAt(0);
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		}
		
		for(String leftWord : map.keySet()) {
			if(leftWord.charAt(0) == leftWord.charAt(1)) {
				answer += 2;
				return answer;
			}
		}
		return answer;
    }
}