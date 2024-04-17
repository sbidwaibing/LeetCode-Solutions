class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        
        int n = nums.length;
        int i = 0;
        
        while(i<n)
        {
            if(nums[i]==target)
            {
                res.add(i); 
            }
            
            i++;
        }
        
        return res;
    }
}