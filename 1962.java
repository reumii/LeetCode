// 1962. Remove Stones to Minimize the Total
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
		for(int p : piles) {
			pq.add(p);
		}
		
		for(int i=0; i<k; i++) {
			int max = pq.poll();
			max -= max/2;
			pq.add(max);
		}
		
		int sum = 0;
		for(int p : pq) {
			sum += p;
		}
       return sum; 
    }
}
