class Solution {
    public int theMaximumAchievableX(int num, int t) {
       for (int i = 0; i < t; i++) {
            if (num > -1) {
                num++;
            } else {
                num--;
            }
        }
        return num + t; 
    }
}