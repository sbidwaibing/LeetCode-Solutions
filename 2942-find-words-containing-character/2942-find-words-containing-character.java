class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        int n = words.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0; i<n; i++)
        {
            String s1 = words[i];
            
            for(int j=0; j<s1.length(); j++)
            {
                if(s1.charAt(j) == x)
                {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}