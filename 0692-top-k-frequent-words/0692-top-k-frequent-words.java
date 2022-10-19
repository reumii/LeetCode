class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> answer = new ArrayList();
		HashMap<String,Integer> map = new HashMap();
		for(String w : words) {
			map.put(w, map.getOrDefault(w, 0)+1);
		}
		
		// sort
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort((o1,o2) -> {
			if(o1.getValue() == o2.getValue()) return o1.getKey().compareTo(o2.getKey()); 
			else return o2.getValue() - o1.getValue();
		});
		
		for(int i=0; i<k; i++) {
			answer.add(entryList.get(i).getKey());
		}
		
		return answer;
    }
}