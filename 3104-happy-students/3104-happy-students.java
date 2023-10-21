class Solution {
    public int countWays(List<Integer> nums) 
    {
        Collections.sort(nums);
        int s = nums.size();
        if(s == 0) return 0;

        int Count = 0;
        if(nums.get(0)>0) Count++;
        
        for(int i=0;i<s-1;i++)
        {
            if(i>=nums.get(i) && i+1<nums.get(i+1))
            {
                Count++;
            }
        }

        if(s-1 >= nums.get(s-1))
        {
            Count++;
        }

        return Count;
    }
}