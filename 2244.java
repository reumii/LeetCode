// 2244. Minimum Rounds to Complete All Tasks
class Solution {
    public int minimumRounds(int[] tasks) {
		HashMap<Integer,Integer> map = new HashMap();
		for(int i=0; i<tasks.length;i++) {
			map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
		}
		
		int roundCnt = 0;
		for(int key : map.keySet()) {
			int round = getRound(map.get(key));
			if(round == -1) return -1;
			roundCnt += round;
		}
        return roundCnt;
    }
	
	public int getRound(int cnt) {
		int max3 = cnt/3;
		
		while(max3 >= 0) {
			int tempCnt = cnt;
			tempCnt -= max3*3;
			if(tempCnt%2==0) {
				return max3 + tempCnt/2;
			}
			max3--;
		}

		return -1;
	}
}
