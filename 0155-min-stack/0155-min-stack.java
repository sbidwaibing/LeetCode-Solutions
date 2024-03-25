class MinStack {

    Stack<Integer> st = new Stack<Integer>();
    Stack<Integer> minSt;

    public MinStack() 
    {
        minSt = new Stack<Integer>();  
    }
    
    public void push(int val) 
    {
        st.push(val);  
        
        if(minSt.isEmpty())
        {
            minSt.push(val);
        }
        else if(val <= minSt.peek()) 
        {
            minSt.push(val); 
        }
    }
    
    public void pop() 
    {
        int val = st.peek();
        st.pop();
        if(val == minSt.peek()) minSt.pop();
    }
    
    public int top() 
    {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
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