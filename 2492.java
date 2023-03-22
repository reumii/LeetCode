// 2492. Minimum Score of a Path Between Two Cities
class RoadCost {
    int node;
    int cost;
    RoadCost(int node, int cost){
        this.node = node;
        this.cost = cost;
    }
}

class Solution {
    public int minScore(int n, int[][] roads) {
        ArrayList<RoadCost> list[] = new ArrayList[n+1];
		for(int i=0; i<=n; i++) {
			list[i] = new ArrayList<RoadCost>();
		}
		
		for(int i=0; i<roads.length; i++) {
			int n1 = roads[i][0];
			int n2 = roads[i][1];
			int cost = roads[i][2];
			list[n1].add(new RoadCost(n2,cost));
			list[n2].add(new RoadCost(n1,cost));
		}
		
		int min = Integer.MAX_VALUE;
		Queue<Integer> queue = new LinkedList();
		queue.add(1);
		boolean visited[] = new boolean[n+1];
		
		while(queue.size() > 0) {
			int node = queue.poll();
			if(!visited[node]) {
				visited[node] = true;
				for(int i=0; i<list[node].size(); i++) {
					RoadCost rc = list[node].get(i);
					min = Math.min(min, rc.cost);
					queue.add(rc.node);
				}
			}
		}
		
		return min;
    }
}
