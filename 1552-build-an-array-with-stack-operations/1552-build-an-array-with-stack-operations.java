class Solution {
    public List<String> buildArray(int[] target, int n) 
    {
        ArrayList<String> ans = new ArrayList<>();
        int nums = 1;

        for(int x:target)
        {
            while(nums<x)
            {
                nums++;
                ans.add("Push");
                ans.add("Pop");
            }
            ans.add("Push");
            nums++;
        }    
        return ans;
    }
}