// 1137. N-th Tribonacci Number
class Solution {
    public int tribonacci(int n) {
        if(n<=0) {
			return 0;
		}else if(n<=2) {
			return 1;
		}
		
		int num[] = new int[n+1];
		num[0] = 0;
		num[1] = 1;
		num[2] = 1;
		for(int i=3; i<=n; i++) {
			num[i] = num[i-1] + num[i-2] + num[i-3];
		}
        return num[n];
    }
}
