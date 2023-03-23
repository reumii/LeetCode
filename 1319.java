// 1319. Number of Operations to Make Network Connected
class Solution {
    public ArrayList<Integer> connect[];
	public boolean visited[];
	public int makeConnected(int n, int[][] connections) {
		if(n > connections.length+1) return -1;
		int cnt = 0;
		connect = new ArrayList[n];
		for(int i=0; i<n; i++) {
			connect[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<connections.length; i++) {
			int n1 = connections[i][0];
			int n2 = connections[i][1];
			connect[n1].add(n2);
			connect[n2].add(n1);
		}
		
		visited = new boolean[n];	
		for(int i=0; i<n; i++) {
			if(!visited[i]) {
				cnt++;
				dfs(i);
			}
		}
		
        return cnt-1;
    }
	
	public void dfs(int n) {
		visited[n] = true;
		for(int i : connect[n]) {
			if(!visited[i]) {
				dfs(i);
			}
		}
	}
}
