class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        int[] arr = new int[99999];
        Arrays.fill(arr, -1);
        List<Integer> ans = new ArrayList<>();
        
        for (int i : nums) {
            if (arr[i] != -1) {
                ans.add(i);
            } else {
                arr[i] = 0;
            }
        }
        
        return ans;
    }
}