class Solution {
    public boolean isValid(String s) 
    {
        //init
        if(s.length()==1)
        {
            return false;
        }
        else
        {
           Stack<Character> s1 = new Stack<>();
        
            for(char c: s.toCharArray())
            {
                if(c=='(' || c=='{' || c=='[')
                {
                    s1.push(c);
                }
                else if(c==')') 
                {    
                    if(s1.isEmpty() || s1.pop() != '(')
                    return false;
                }
                else if(c=='}') 
                {    
                    if(s1.isEmpty() || s1.pop() != '{')
                    return false;
                }
                else if(c==']') 
                {
                    if(s1.isEmpty() || s1.pop() != '[')
                    return false;
                }
            }
            
            if(s1.isEmpty())
            {
                return true;
            }
            return false;
        }
    }
}