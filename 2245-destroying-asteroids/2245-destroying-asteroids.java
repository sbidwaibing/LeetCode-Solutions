class Solution {
    public boolean asteroidsDestroyed(int mass, int[] A) 
    {
        int n = A.length;
        Arrays.sort(A);
        long sum = mass;
        for(int i = 0; i < n; i++)
        {
            if(sum>=A[i])
            {
               sum+=A[i];
            }
            else
            {
                return false;
            } 
        }
        return true;
    }
}