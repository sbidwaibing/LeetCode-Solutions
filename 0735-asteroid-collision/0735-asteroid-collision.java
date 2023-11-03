class Solution {
    public int[] asteroidCollision(int[] a) 
    {
        int n = a.length;
        Stack<Integer> s = new Stack<>(); 

        for(int i=0; i<n; i++)
        {
            while(!s.isEmpty() && a[i]<0 && s.peek()>0)
            {
                int sum = a[i]+s.peek();
                if(sum<0)
                {
                    s.pop();
                }
                else if(sum>0)
                {
                    a[i]=0;
                }
                else
                {
                    s.pop();
                    a[i]=0;
                }
            }

            if(a[i]!=0)
            {
                s.push(a[i]);
            }
        } 

        int[] res = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            res[i] = s.pop();
        }
        return res;  
    }
}