class Solution {
    public int[] productExceptSelf(int[] nums) {   
        int n = nums.length;
        int[] ans = new int[n];
        
        int[] lft = new int[n];
        int[] rgt = new int[n];
        
        int lftprod = 1;
        int rgtprod = 1;        
        
        // Multiplying Results of Left Product
        lft[0] = 1;
        for(int i = 1; i < n; i++) {
            lft[i] = lftprod * nums[i - 1];
            lftprod = nums[i - 1] * lftprod;
        }
        
        // Multiplying Results of Right Product
        rgt[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--) {
            rgt[i] = rgtprod * nums[i + 1];
            rgtprod = nums[i + 1] * rgtprod;
        }
        
        // Muliplying the results of Left Product and Right Product
        for(int i = 0; i < n; i++) {
            ans[i] = lft[i] * rgt[i];
        }
        
        return ans;
    }
}
