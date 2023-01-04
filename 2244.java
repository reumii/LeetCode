// 2244. Minimum Rounds to Complete All Tasks
class Solution {
	// 1번째 풀이
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
	
	// 2번째 풀이
	public int minimumRounds2(int[] tasks) {
		HashMap<Integer,Integer> map = new HashMap();
		for(int t : tasks) map.put(t, map.getOrDefault(t, 0) + 1);
		
		int roundCnt = 0;
		for(int cnt : map.values()) {
			if(cnt<=1) return -1;
			roundCnt += cnt/3;
			if(cnt%3!=0) roundCnt++;
			// 3으로 나눴을 때 
			// 나머지가 1 -> 3tasks하는 라운드를 하나 줄이고 2tasks하는 라운드가 두번 추가됨 => 1번 추가
			// 나머지가 2 -> 2tasks하는 라운드가 하나 추가됨 => 1번 추가
		}
		
        return roundCnt;
    }
}
