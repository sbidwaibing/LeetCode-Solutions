class Solution {
    public int findMaxK(int[] nums) 
    {
        HashSet<Integer> hp = new HashSet<Integer>();
        int ans = -1;
        
        for(int i=0;i<nums.length; i++)
        {
            if(hp.contains(nums[i]*-1))
            {
                ans = Math.max(ans, Math.abs(nums[i]));
                
            }
            else
            {
                hp.add(nums[i]);
            }
        }
        
        return ans;
    }
}