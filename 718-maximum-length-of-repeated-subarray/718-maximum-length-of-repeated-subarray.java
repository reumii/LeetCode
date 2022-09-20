class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int answer = 0;
		
		for(int i=0; i<nums1.length && answer<nums1.length-i; i++) {
			for(int j=0; j<nums2.length && answer<nums2.length-j; j++) {
				int length = 0;
				int index1 = i;
				int index2 = j;
				while(index1 < nums1.length && index2<nums2.length && nums1[index1] == nums2[index2]) {
					length++;
					index1++;
					index2++;
				}
				answer = Math.max(answer, length);
			}
		}
		
        return answer;
    }
}