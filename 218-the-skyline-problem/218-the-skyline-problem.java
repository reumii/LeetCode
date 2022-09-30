class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
		List<int[]> height = new ArrayList<int[]>();
		for(int i=0; i<buildings.length; i++) {
			height.add(new int[] {buildings[i][0],buildings[i][2]}); // startX , height
			height.add(new int[] {buildings[i][1],-buildings[i][2]});// endX , -height
		}
		
		Collections.sort(height,(o1,o2)->{
			if(o1[0] > o2[0]) return 1;
			else if(o1[0] == o2[0] && o1[1] < o2[1]) return 1;
			else return -1;
		});
		
		int nowHeight = 0;
		PriorityQueue<Integer> q = new PriorityQueue(Collections.reverseOrder());
		q.add(0);
		for(int i=0; i<height.size(); i++) {
			if(height.get(i)[1] < 0) {
				q.remove(-height.get(i)[1]);
			}else {
				q.add(height.get(i)[1]);
			}
			
			if(nowHeight != q.peek()) {
				nowHeight = q.peek();
				List<Integer> list = new ArrayList(Arrays.asList(height.get(i)[0],nowHeight));
				answer.add(list);
			}
		}
		
		return answer;
    }
}