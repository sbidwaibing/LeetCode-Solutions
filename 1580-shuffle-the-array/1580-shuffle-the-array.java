class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int s = nums.length;
        int[] result = new int[s];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        
        return result;
    }
}