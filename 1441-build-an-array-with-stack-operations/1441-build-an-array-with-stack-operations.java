class Solution {
    public List<String> buildArray(int[] target, int n) {
       List<String> answer = new ArrayList();
    	int index = 0;
    	for(int i=1; i<=n; i++) {
    		if(index >= target.length) {
    			return answer;
    		}else if(target[index] == i) {
    			answer.add("Push");
    			index++;
    		}else {
    			answer.add("Push");
    			answer.add("Pop");
    		}
    	}
        return answer;
    }
}