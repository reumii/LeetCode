class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int answer = 0;
        int length = img1.length;
        int cnt[][] = new int[length][length];
        
        for(int i=0; i<length; i++) {
        	for(int j=0; j<length; j++) {
        		answer = Math.max(answer, checkOverLap(img1, img2, i, j));
        	}
        }
        return answer; 
    }
	
	public int checkOverLap(int[][] img1, int[][] img2, int x, int y) {
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int cnt4 = 0;

		if(x == 0 && y == 0) {
			for(int i=0; i<img1.length-x; i++) {
				for(int j=0; j<img1.length-y; j++) {
					cnt1 += img1[i+x][j+y] * img2[i][j];
				}
			}
			
			return cnt1;
		}else {
			for(int i=0; i<img1.length-x; i++) {
				for(int j=0; j<img1.length-y; j++) {
					cnt1 += img1[i+x][j+y] * img2[i][j];
					cnt2 += img1[i][j] * img2[i+x][j+y];
					cnt3 += img1[i+x][j] * img2[i][j+y];
					cnt4 += img1[i][j+y] * img2[i+x][j];
				}
			}
		}

		return Math.max(Math.max(cnt3, cnt4),Math.max(cnt1, cnt2));
	}
}