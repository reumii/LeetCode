class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> answer = new ArrayList<Integer>();
		Queue<Integer> q = new LinkedList();
		int max = Math.abs(arr[0] - x);
		
		for(int i=0; i<arr.length; i++) {
			if(q.size() >= k) {
				if(max >  Math.abs(arr[i] - x)) {
					q.poll();
					q.add(arr[i]);
					max = Math.abs(q.peek() - x);
				}else if(max ==  Math.abs(arr[i] - x) && q.peek() > arr[i]) {
					q.poll();
					q.add(arr[i]);
					max = Math.abs(q.peek() - x);
				}
			}else {
				q.add(arr[i]);
			}
		}
		
		for(int n : q) {
			answer.add(n);
		}
		return answer;
    }
}