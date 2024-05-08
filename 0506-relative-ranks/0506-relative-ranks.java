class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
        int n = score.length;
        
        int[] scoreCopy = new int[n];
        System.arraycopy(score, 0, scoreCopy, 0, n);
        
        String[] rank = new String[n];
        
        Map<Integer, Integer> scoreToIndex = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            scoreToIndex.put(scoreCopy[i], i);
        }
        
        Arrays.sort(scoreCopy);
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                rank[scoreToIndex.get(scoreCopy[n - i - 1])] = "Gold Medal";
            } else if (i == 1) {
                rank[scoreToIndex.get(scoreCopy[n - i - 1])] = "Silver Medal";
            } else if (i == 2) {
                rank[scoreToIndex.get(scoreCopy[n - i - 1])] = "Bronze Medal";
            } else {
                rank[scoreToIndex.get(scoreCopy[n - i - 1])] = Integer.toString(i + 1);
            }
        }
        
        return rank;
    }
}