// 223. Rectangle Area
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int area1 = Math.abs((ax2 - ax1) * (ay2 - ay1));
		int area2 = Math.abs((bx2 - bx1) * (by2 - by1));
		
		int width = 0;
		if(ax1 <= bx1  && bx1 < ax2) width = Math.min(ax2, bx2) - bx1;
		else if(ax1 < bx2  && bx2 <= ax2) width = bx2 - Math.max(ax1, bx1);
		else if(bx1 <= ax1 && ax2 <= bx2) width = ax2 - ax1;
		else if(ax1 <= bx1 && bx2 <= ax2) width = bx2 - bx1;
		else return area1 + area2;
		
		int height = 0;
		if(ay1 <= by1  && by1 < ay2) height = Math.min(ay2, by2) - by1;
		else if(ay1 < by2  && by2 <= ay2) height = by2 - Math.max(ay1, by1);
		else if(by1 <= ay1 && ay2 <= by2) height = ay2 - ay1;
		else if(ay1 <= by1 && by2 <= ay2) height = by2 - by1;
		else return area1 + area2;
		
    return area1 + area2 - Math.abs(width * height);
    }
}
