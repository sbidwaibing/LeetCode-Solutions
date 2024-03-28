class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        if(k <= 1) return 0;
        
        int res = 0;
        int prod = 1;
        int i = 0;
        int j = 0;
        
        while(j < nums.length)
        {
            prod *= nums[j];

            while(prod >= k)
            {
                prod = prod / nums[i];
                i++;
            }

            res += j-i+1;
            j++;
        }
        return res;
    }
}