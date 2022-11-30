//1207. Unique Number of Occurrences
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap();
		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		HashSet set = new HashSet<Integer>();
		for(int i: map.keySet()) {
			if(set.contains(map.get(i))) return false;
			else set.add(map.get(i));
		}
        return true;
    }
}
