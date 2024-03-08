class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        // bruteforce approach, sorting arrays initially, 
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1]) return true;
        }        
        return false;
    }
}