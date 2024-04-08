class Solution {
    public int countStudents(int[] stud, int[] sand) 
    {
        Queue<Integer> stqu = new LinkedList<>();
        Stack<Integer> snst = new Stack<>();
        int n = stud.length;
        
        for(int i=0; i<n; i++)
        {
            snst.push(sand[n -i -1]);
            stqu.offer(stud[i]);
        }
        
        int count = 0;
        
        while(stqu.size() > 0 && count < stqu.size())
        {
            if(snst.peek() == stqu.peek())
            {
                snst.pop();
                stqu.poll();
                count = 0;
            }
            else
            {
                stqu.offer(stqu.poll());
                count++;
            }
        }
        return stqu.size();
    }
}