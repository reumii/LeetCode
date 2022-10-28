class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map =  new HashMap();
		for(int i=0; i<strs.length; i++) {
			String anagram = getAnagram(strs[i]);
			List<String> anagramList = map.getOrDefault(anagram, new ArrayList<String>());
			anagramList.add(strs[i]);
			map.put(anagram,anagramList);
		}
		
		List<List<String>> answer = new ArrayList<List<String>>();
		for(String key : map.keySet()) {
			List<String> wordList= new ArrayList<String>();
			for(String word : map.get(key)) {
				wordList.add(word);
			}
			
			answer.add(wordList);
		}
		return answer;
    }
	
	public String getAnagram(String str) {
		String letter[] = str.split("");
		Arrays.sort(letter);
		return String.join("", letter);
	}
}