// 2279. Maximum Bags With Full Capacity of Rocks
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for(int i=0; i<capacity.length; i++) {
			capacity[i] -= rocks[i]; 
		}
		
		Arrays.sort(capacity);
		
		for(int i=0; i<capacity.length; i++) {
			if(capacity[i] > 0) {
				if(capacity[i] > additionalRocks) {
					return i;
				}else{
					additionalRocks -= capacity[i];
				}
			}
		}
		
        return capacity.length;
    }
}
