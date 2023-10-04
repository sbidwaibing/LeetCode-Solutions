/*
 * LeetCode Problem No: 
 * 1877. Minimize Maximum Pair Sum in Array
 * 
 * (Two Pointer Approach)
 * 
 * The pair sum of a pair (a,b) is equal to a + b. The maximum pair sum is the largest pair sum in a list of pairs.
 * 
 * For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.
 * Given an array nums of even length n, pair up the elements of nums into n / 2 pairs such that:

 * Each element of nums is in exactly one pair, and
 * The maximum pair sum is minimized.
 * Return the minimized maximum pair sum after optimally pairing up the elements.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MaxPair 
{
    public int compute(int[] nums)
    {
        Arrays.sort(nums);

        int res = 0;

        for(int j = 0; j<nums.length / 2; j++)
        {
            int pair  = nums[j]+nums[nums.length - 1 - j];
            res = Math.max(res, pair);
        }

        System.out.println("The max of pair is "+res);

        return res;
    }

    public static void main(String[] args)
    {

        System.out.println("Enter the Size of the Array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter "+n+" Elements of an Array:");
        
        for(int i =0; i<nums.length; i++)
        {
            nums[i] =  scanner.nextInt();
        }
        scanner.close();

        MaxPair mx = new MaxPair();
        mx.compute(nums);
    }

}

/*
 * OUTPUT:
 * Enter the Size of the Array
 * 6
 * Enter 6 Elements of an Array:
 * 3
 * 5
 * 4
 * 2
 * 4
 * 6
 * The max of pair is 8
 */