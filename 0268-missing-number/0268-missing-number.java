class Solution {
    public int missingNumber(int[] nums) 
    {
        int missing = nums.length; // Initialize missing as the length of the array
        for (int i = 0; i < nums.length; i++) { // Loop through the array
        // In each iteration, XOR the index (i) with the value at that index (nums[i])
            missing ^= i ^ nums[i];
        }
        return missing; // Return the missing number    
    }
}