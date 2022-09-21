class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i]%2==0) {
        		sum += nums[i];
        	}
        }
        
        int[] answer = new int[queries.length];
        for(int i=0; i<queries.length; i++) {
        	int val = queries[i][0];
        	int index = queries[i][1];
        	if(nums[index]%2==0) {
        		if(val%2==0) {
        			sum += val;
        		}else {
        			sum-=nums[index];
        		}
        	}else if(val%2!=0){
        		sum += nums[index]+val;
        	}
        	nums[index] += val;
        	answer[i] = sum;
        }
        
        return answer;
    }
}