// 1466. Reorder Routes to Make All Paths Lead to the City Zero
class Road{
	int node;
	boolean direction;
	
	public Road(int node, boolean direction) {
		this.node = node;
		this.direction = direction;
	}
}

class Solution {	
	public int minReorder(int n, int[][] connections) {
		int min = 0;
		ArrayList<Road> list[] = new ArrayList[n];
		for(int i=0; i<n; i++) {
			list[i] = new ArrayList<Road>();
		}
		
		for(int i=0; i<connections.length; i++) {
			int n1 = connections[i][0];
			int n2 = connections[i][1];
			
			list[n1].add(new Road(n2,true));
			list[n2].add(new Road(n1,false));
		}
		
		boolean visited[] = new boolean[n];
		Queue<Integer> queue = new LinkedList();
		queue.add(0);
		while(queue.size() > 0) {
			int node = queue.poll();
			visited[node] = true;
			for(Road r : list[node]) {
				if(!visited[r.node]) {
					if(r.direction) {
						System.out.println(node + "," +r.node);
						min++;
					}
					queue.add(r.node);
				}
			}
		}
		
        return min;
    }
}
