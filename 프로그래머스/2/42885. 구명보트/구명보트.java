import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int boat = 0;
        int r = 0;
        
        Arrays.sort(people);
        
        for(int h = people.length - 1; h >= r; h--){
            if((people[h] + people[r]) <= limit)
                r++;
            
            boat++;
        }
        
        return boat;
    }
}