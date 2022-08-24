class Solution {
    public boolean isPowerOfThree(int n) {
        int index = 1;
        double power = 1;
        while(power < n) {
            power = Math.pow(3, index);
            index++;
        }

        if(power == n) {
            return true;
        }

        return false;
    }
}