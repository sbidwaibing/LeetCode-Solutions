class Solution {
    public int maxIceCream(int[] c1, int c) 
    {
        Arrays.sort(c1);
        int n = c1.length;
        int count = 0;

        for (int i=0; i<n; i++)
        {
            if (c >= c1[i])
            {
                c -= c1[i];
            }
            else
            {
                return i;//we can't purchase anymore
            } 
        }
        return n; 
    }
}