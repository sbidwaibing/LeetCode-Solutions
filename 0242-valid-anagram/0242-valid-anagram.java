class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length()) return false;
        int[] C_Count = new int[26];
        
        for(int i=0; i<s.length(); i++)
        {
            C_Count[s.charAt(i)-'a']++;
            C_Count[t.charAt(i)-'a']--;
        }
        
        for(int count:C_Count)
        {
            if(count!=0)
            {
                return false;
            }
        }
        return true;
    }
}