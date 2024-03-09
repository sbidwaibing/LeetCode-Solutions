class Solution {
    public int maxArea(int[] h) 
    {
        int n = h.length;
        int res = 0;
        int area;
        int i = 0;
        int j = n-1;
        
        while(i<j)
        {
            area = (j-i) * Math.min(h[i], h[j]);
            res = Math.max(res, area);
            
            if(h[i]<h[j])
            {
                i+=1;
            }
            else
            {
                j-=1;
            }
        }
        return res;
    }
}