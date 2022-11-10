// 1047. Remove All Adjacent Duplicates In String
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
		
		for(int i=0; i<s.length(); i++) {
			if(stack.size()>0 && stack.peek() == s.charAt(i)) {
				stack.pop();
			}else {
				stack.add(s.charAt(i));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : stack) {
			sb.append(c);
		}

		return sb.toString();
    }
}
