import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        char ch;
        int idx;
        
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            
            if(map.containsKey(ch)){
                idx = i - map.get(ch);
                answer[i] = idx;
            }else{
                answer[i] = -1;
            }
            
                map.put(ch, i);
        }
        return answer;
    }
}