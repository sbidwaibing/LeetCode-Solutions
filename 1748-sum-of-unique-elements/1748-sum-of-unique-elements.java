class Solution {
    public int sumOfUnique(int[] nums) 
    {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
           boolean isunique=true;
           for(int j=0;j<n;j++)
           {
               if(i!=j && nums[i]==nums[j])
               {
                   isunique=false;
                   break;
               }
               }
               if(isunique)
               {
                   count+=nums[i];
               }
           }
        
        return count;
    }
}