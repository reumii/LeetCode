class Solution {
    public String countAndSay(int n) { 
        if(n<=1) return "1";
        
        String answer = "1";
        while(n > 1) {
        	n--;
        	answer = say(answer);
        }
        return answer;
    }
	
	public String say(String result) {
		StringBuilder count = new StringBuilder();
		Stack<Character> stack = new Stack();
		stack.add(result.charAt(0));
		for(int i=1; i<result.length(); i++) {
			char c = result.charAt(i);
			if(stack.peek() != c) {
				count.append(stack.size() + "" + stack.pop());
				stack.clear();
			}
			stack.add(c);
		}
		
		if(stack.size() > 0) {
			count.append(stack.size() + "" + stack.pop());
		}
		return count.toString();
	}
}