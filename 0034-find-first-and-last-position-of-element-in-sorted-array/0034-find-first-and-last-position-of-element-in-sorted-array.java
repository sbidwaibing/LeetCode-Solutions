class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int[] result = new int[]{-1, -1};
        
        if (nums == null || nums.length == 0) return result;
        
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        if (first <= last) {
            result[0] = first;
            result[1] = last;
        }

        return result;    
    }
    
    private int findFirst(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) end = mid - 1;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }
    
    private int findLast(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) start = mid + 1;
            else if (nums[mid] > target)  end = mid - 1;
            else start = mid + 1;
        }
        return end;
    }
    
}