class Solution {
    public int maxProfit(int[] p) 
    {
        int prof = 0;
        int min = p[0];
        int n = p.length;

        if(p == null || n <=1) return 0;

        for(int i=1; i<n; i++)
        {
            min = Math.min(min, p[i]);
            prof = Math.max(prof, p[i]-min);
        }

        return prof;
    }
}