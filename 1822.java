//1822. Sign of the Product of an Array
class Solution {
    public int arraySign(int[] nums) {
        int minusCnt = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 0) return 0;
			else if(nums[i] < 0) minusCnt++;
		}
		
		if(minusCnt % 2 ==0) {
			return 1;
		}
        return -1;
    }
}
