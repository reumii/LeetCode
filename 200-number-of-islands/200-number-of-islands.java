class Solution {
    public static int move[][] = {{0,1},{0,-1},{1,0},{-1,0}};
    public static char grid2[][];
    public int numIslands(char[][] grid) {
        int answer = 0;
        grid2 = grid;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    answer++;
                    check(i,j);
                }
            }
        }

        return answer;
    }

    public static void check(int i, int j) {
        if(i>=0 && i<grid2.length&& j>=0 && j<grid2[0].length && grid2[i][j] == '1') {
            grid2[i][j] = '0';
            for(int k=0; k<4; k++) {
                check(i+move[k][0], j+move[k][1]);
            }
        }
    }
}