// 26. Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1) {
			return nums.length;
		}
		
		int index = 0;
		for(int i=1; i<nums.length; i++) {
			if(nums[index] != nums[i]) {
				index++;
				nums[index] = nums[i];
			}
		}
        return index+1;
    }
}
