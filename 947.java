// 947. Most Stones Removed with Same Row or Column
class Solution {
  boolean[] visited;
	public int removeStones(int[][] stones) {
		int cnt = 0;
		visited = new boolean[stones.length];
		
		for(int i=0; i<stones.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				cnt += dfs(i,stones);
			
			}
		}
        return cnt;
    }
	
	public int dfs(int index, int[][] stones) {
		int cnt = 0;
		for(int i=0; i<stones.length; i++) {
			if(!visited[i] && (stones[index][0]==stones[i][0] || stones[index][1]==stones[i][1])) {
				cnt++;
				visited[i] = true;
				cnt += dfs(i, stones);
			}
		}
		return cnt;
	}
}
