class Solution {
    public int minPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length / 2; i++)
        {   
            int sum = nums[i] + nums[nums.length - 1 -i];
            res = Math.max(res, sum); 
        }
        
        return res;
    }
}