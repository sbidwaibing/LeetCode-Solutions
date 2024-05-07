class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
      int res =0;
        int key = Integer.MIN_VALUE;
        int val = Integer.MIN_VALUE;

        for(int i=1; i< nums.length; i++){
            int d = nums[i]-nums[i-1];
            if(key != d){
                key = d;
                val = 0;
            }
            else val++;
            if(val >= 1) res+= val;
        }
        
        return res;  
    }
}