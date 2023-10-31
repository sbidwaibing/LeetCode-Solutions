class Solution {
    public int[] findArray(int[] pref) 
    {
        int i = 0;
        int[] ans = new int[pref.length];
        if(pref.length == 1)
        {
            ans[i] = pref[i];
        }

        for(i=pref.length-1; i>0; --i)
        {
            pref[i] = pref[i]^pref[i-1];
        }

        return pref;  
    }
}