class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push( x );
        if( minStack.isEmpty() ) {
            minStack.push( x );
        }
        else {
            if( x <= minStack.peek() ) {
                minStack.push( x );
            }
            else {
                minStack.push( minStack.peek() );
            }
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        if( !stack.isEmpty() ) {
           return stack.peek();
        }
        else {
            return 0;
        }
    }

    public int getMin() {
        if( !minStack.isEmpty() ) {
           return minStack.peek();
        }
        else {
            return 0;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
