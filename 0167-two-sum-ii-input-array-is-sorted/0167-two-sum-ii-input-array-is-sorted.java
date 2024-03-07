class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n = nums.length;
        
        int i = 0;
        int j = n-1;
       
        int sum = nums[i]+nums[j];
        
        while(sum != target)
        {
            if(sum>target)
            {
                j--;
            }   
            else
            {
                i++;
            }
            sum = nums[i]+nums[j];
        }
        return new int[] {++i, ++j};
    }
}

// Breakdown Debug of the Code A=[2,7,11,15], T=9; 


//int n = nums.length;: The length of the array nums is stored in variable n. In this case, n will be 4 because nums has four elements.

// int i = 0; and int j = n - 1;: Two pointers i and j are initialized. i is set to 0, which points to the first element of the array, and j is set to n - 1, which points to the last element of the array.

// int sum = nums[i] + nums[j];: Calculate the sum of the first and last elements of the array and store it in the variable sum. For the given array A, sum will be A[0] + A[3] = 2 + 15 = 17.

// while (sum != target) {: Enter a while loop that continues until the sum is equal to the target.

// if (sum > target) { j--; } else { i++; }: If the current sum is greater than the target, decrement j (move the right pointer towards the left to reduce the sum). Otherwise, increment i (move the left pointer towards the right to increase the sum).

// sum = nums[i] + nums[j];: Update the sum with the new values pointed by i and j.

// Repeat steps 5 and 6 until the sum equals the target.

// return new int[]{++i, ++j};: Return an array containing the indices of the two numbers whose sum is equal to the target. Since the array is 0-indexed and the pointers i and j were incremented before returning, their values are incremented by 1.

// Let's see how this code performs with the given array A = [2, 7, 11, 15] and target 9:

// Initially, i = 0, j = 3, and sum = A[0] + A[3] = 2 + 15 = 17, which is greater than the target.
// So, j is decremented, j = 2, and sum = A[0] + A[2] = 2 + 11 = 13, which is still greater than the target.
// j is decremented again, j = 1, and sum = A[0] + A[1] = 2 + 7 = 9, which is equal to the target.
// The loop terminates, and the indices of the two numbers whose sum is equal to the target are returned: [1, 2].
// Therefore, the output of the code for the given input is [1, 2], which means that the elements at indices 1 and 2 (7 and 11) of the array add up to the target (9).