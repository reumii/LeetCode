class MinStack {
    public Stack<Integer> stack = new Stack();
    public PriorityQueue<Integer> queue = new PriorityQueue();
    
    public MinStack() {
        stack.clear();
        queue.clear();
    }
    
    public void push(int val) {
        stack.push(val);
        queue.add(val);
    }
    
    public void pop() {
        queue.remove(stack.pop());
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return queue.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */