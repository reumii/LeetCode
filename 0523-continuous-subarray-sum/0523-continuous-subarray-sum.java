class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet();
        set.add(0);
        int sum[] = new int[nums.length];
        sum[0] = nums[0] % k;
        
        for(int i=1; i<nums.length; i++){
            sum[i] = (sum[i-1] + nums[i]) % k;
            if(set.contains(sum[i])){
                return true;
            }
            
            set.add(sum[i-1]);
        }
        
        return false;
    }
}