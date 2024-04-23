class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int n1 = g.length;
        int n2 = s.length;
        int count = 0;
        
        int i=0;
        
        while(i < n2 && count < n1)
        {
            if(s[i] >= g[count]) count++;
            
            i++;
        }
        
        return count;
            
    }
}