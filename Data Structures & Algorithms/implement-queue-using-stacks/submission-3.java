class MyQueue {
    private Deque<Integer> stack;

    public MyQueue() {
        this.stack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        this.stack.addFirst(x);
    }
    
    public int pop() {
        return this.stack.pollLast();
    }
    
    public int peek() {
        return this.stack.peekLast();
    }
    
    public boolean empty() {
        return this.stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */