import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
        return toMap(before).equals(toMap(after)) ? 1 : 0;
    }
    
    public static Map<String, Long> toMap(String word){
        return Arrays.stream(word.split(""))
            .collect(Collectors.groupingBy(
            Function.identity(), Collectors.counting()));
    }
}