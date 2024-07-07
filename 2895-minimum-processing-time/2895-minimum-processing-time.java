class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int n  = processorTime.size();
        Collections.sort(processorTime);
        Collections.sort(tasks);
        int k = 0 ;
        int ans = Integer.MIN_VALUE;
        int i=tasks.size()-1;
        while(i>0){
            int a = Math.max(processorTime.get(k)+tasks.get(i),processorTime.get(k)+tasks.get(i-1));
            int b = Math.max(processorTime.get(k)+tasks.get(i-2),processorTime.get(k)+tasks.get(i-3));
            int max = Math.max(a,b);
            ans = Math.max(max,ans);
            i-=4;
            k+=1;
        }
        return ans;
    }
}