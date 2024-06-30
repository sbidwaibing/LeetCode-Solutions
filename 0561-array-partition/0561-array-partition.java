class Solution {
    public int arrayPairSum(int[] nums) 
    {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        
        for(int i=0; i<n-1; i+=2)
        {
            System.out.println(Math.min(nums[i], nums[i+1]));
            sum += Math.min(nums[i], nums[i+1]);
        }
        
        return sum;
    }
}