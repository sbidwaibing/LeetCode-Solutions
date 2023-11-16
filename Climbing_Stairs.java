class Climbing_Stairs 
{
    public static void main(String[] args)
    {
        int n = 4;
        Climbing_Stairs  s = new Climbing_Stairs ();
        s.climbStairs(n);
    }

    public int climbStairs(int n) 
    {
        if (n <= 2)
        {
            return n;
        }
        
        int x = 1, y = 2;
        for(int i = 2; i < n; i ++) 
        {
            int temp = x; 
            x = y; 
            y = temp + y;
        }

        System.out.println(y);
        return y;
    }
}
Runtime Details 0ms
Beats 100.00 % of users with Java 
MemoryDetails 38.58MB Beats 97.61%of users with Java