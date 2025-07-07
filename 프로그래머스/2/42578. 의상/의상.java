import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        int answer = 1;
        
        for(String[] str : clothes){
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
        }
        
        for(Integer num : map.values()){
            answer *= num + 1;
        }
        
        return answer - 1;
    }
}