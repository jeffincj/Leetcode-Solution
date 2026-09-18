class MinStack {
    Deque <Integer>stack=new ArrayDeque<>();
    Deque <Integer>mstack=new ArrayDeque<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        stack.push(value);
        if (mstack.isEmpty()||mstack.peek()>=value)mstack.push(value);
    }
    
    public void pop() {
        if (stack.isEmpty())return ;
        int po=stack.pop();
        if (!mstack.isEmpty()&&po==mstack.peek())mstack.pop();

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */