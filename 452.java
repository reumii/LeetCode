// 452. Minimum Number of Arrows to Burst Balloons
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,Comparator.comparingInt(o -> o[1]));
		
		int result = 1;
		int arrow = points[0][1];
		for(int i=1; i<points.length; i++) {
			if(points[i][0] > arrow) {
				result++;
				arrow = points[i][1];
			}
		}
		
        return result;
    }
}
