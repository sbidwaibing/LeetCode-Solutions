class Solution {
    public boolean isPerfectSquare(int num) {
     int start=1;
        int end=num;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(num/mid<mid){
                end=mid-1;
            }
            else if(num/mid==mid && num%mid==0){
                return true;
            }
            else{
                start=mid+1;
            }
        }
        return false;   
    }
}