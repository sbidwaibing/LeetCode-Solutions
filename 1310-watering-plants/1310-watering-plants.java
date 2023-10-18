class Solution {
    public int wateringPlants(int[] plants, int capacity) {
       int water = capacity;
        int count = 0;

        for(int i = 0; i < plants.length; i++) {
            if(water < plants[i]) {
                count += (i + i + 1);
                water = capacity - plants[i];
            } else {
                count++;
                water -= plants[i];
            }
        }

        return count; 
    }
}