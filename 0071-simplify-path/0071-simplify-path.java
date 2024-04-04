class Solution {
    public String simplifyPath(String path) 
    {
        Stack<String> s1 = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");
        
        for(int i=0 ;i<p.length; i++)
        {
            if(!s1.isEmpty() && p[i].equals("..")) s1.pop();
            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
                s1.push(p[i]);
        }
        
        if(s1.isEmpty()) return "/";
        
        while(!s1.isEmpty())
        {
            res.insert(0, s1.pop()).insert(0,"/");
        }
        
        return res.toString();
    }
}