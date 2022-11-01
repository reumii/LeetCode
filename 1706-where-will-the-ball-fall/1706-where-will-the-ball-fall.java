class Solution {
    public int[] findBall(int[][] grid) {
		int[] answer = new int[grid[0].length];
		for(int i=0; i<grid[0].length; i++) {
			answer[i] = returnBall(grid, 0, i);
		}
		return answer;
    }
	
	public int returnBall(int[][] grid, int x, int y) {
		if(x == grid.length) {
			return y;
		}else if(grid[x][y] == 1) { // right
			if(y+1<grid[0].length && grid[x][y+1] == 1) return returnBall(grid, x+1, y+1);
			else return -1;
		}else { // left
			if(y-1>=0 && grid[x][y-1] == -1) return returnBall(grid, x+1, y-1);
			else return -1;
		}
	}
}