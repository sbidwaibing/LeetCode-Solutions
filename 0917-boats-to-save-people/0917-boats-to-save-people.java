class Solution {
    public int numRescueBoats(int[] p, int limit) 
    {
        int Bcount = 0;
        Arrays.sort(p);

        int i = 0;
        int j = p.length-1;

        while(i<=j)
        {
            if(p[i]+p[j]<=limit)
            {
                i++;
            }
            j--;
            Bcount++;
        }
    return Bcount;
    }
}