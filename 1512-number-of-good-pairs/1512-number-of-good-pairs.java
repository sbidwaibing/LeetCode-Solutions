class Solution {
    public int numIdenticalPairs(int[] nums) 
    {
        int n = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        if(n<1) return 0;
        
        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(Integer key: map.keySet()){
            int value = map.get(key);
            count+=(value*(value-1)/2);
        }
        
        return count;
    }
}