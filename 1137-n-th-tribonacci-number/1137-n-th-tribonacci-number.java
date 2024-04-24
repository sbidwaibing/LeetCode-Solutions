class Solution {
    public int tribonacci(int n) {
        int t1 = 0, t2 = 1, t3 = 1;
        int tb = 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            tb = t1 + t2 + t3;
            t1 = t2;
            t2 = t3;
            t3 = tb;
        }
        return tb;
    }
}