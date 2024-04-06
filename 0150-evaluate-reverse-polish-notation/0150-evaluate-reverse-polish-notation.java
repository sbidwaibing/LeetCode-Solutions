class Solution {
    public int evalRPN(String[] tokens) 
    {
        int n = tokens.length;
        int res = 0;
        Stack<String> st = new Stack<>();
        
        for(int i=0; i<n; i++)
        {
            String x = tokens[i];
            st.push(x);
            
            String a,b;
            
            if(st.peek().equals("+"))
            {
                st.pop();
                a = st.pop();
                b = st.pop();
                res = Integer.valueOf(a) + Integer.valueOf(b);
                st.push(Integer.toString(res));
            }
            
            if(st.peek().equals("-"))
            {
                st.pop();
                a = st.pop();
                b = st.pop();
                res = Integer.valueOf(b) - Integer.valueOf(a);
                st.push(Integer.toString(res));
            }
            
            if(st.peek().equals("*"))
            {
                st.pop();
                a = st.pop();
                b = st.pop();
                res = Integer.valueOf(a) * Integer.valueOf(b);
                st.push(Integer.toString(res));
            }
            
            if(st.peek().equals("/"))
            {
                st.pop();
                a = st.pop();
                b = st.pop();
                res = Integer.valueOf(b) / Integer.valueOf(a);
                st.push(Integer.toString(res));
            }
        }  
        return Integer.valueOf(st.peek());
    }    
}
