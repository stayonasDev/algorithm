import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> hash = new HashMap<>();
        int[] answer = new int[photo.length];

        for(int i=0; i<name.length; i++){
            hash.put(name[i], yearning[i]);
        }
        
        
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                if(hash.containsKey(photo[i][j])){
                   answer[i] += hash.get(photo[i][j]); 
                }
            }
        }
        
        return answer;
    }
}