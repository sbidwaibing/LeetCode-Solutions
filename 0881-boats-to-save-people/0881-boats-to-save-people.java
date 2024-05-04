class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int i = 0 ; 
        int j = people.length - 1;
        int count = 0;
        
        while(i <= j){
           
            if(people[i] + people[j] <= limit){
                count++;
                i++;
                j--;
            }
            else if(Math.abs(people[i] - limit) > Math.abs(people[j] - limit))
            {
                j--;
                count++;
            }
            else
            {
                i++;
                count++;
            }
        }
        
        return count; 
    }
}