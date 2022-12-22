// 841. Keys and Rooms
class Solution {
    public HashSet<Integer> set;
	public boolean visited[];
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		set = new HashSet<Integer>();
		visited = new boolean[rooms.size()];
		visit(0,rooms);
		
		for(boolean v : visited) {
			if(!v) return false;
		}
        return true;
    }
	
	public void visit(int n, List<List<Integer>> rooms) {
		visited[n] = true;
		List<Integer> list = rooms.get(n);
		for(int room : list) {
			if(!visited[room]) {
				visit(room,rooms);
			}
		}
	}
}
