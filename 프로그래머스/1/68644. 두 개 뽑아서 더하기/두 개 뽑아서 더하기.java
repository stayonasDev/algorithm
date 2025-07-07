import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                hash.add(numbers[i] + numbers[j]);
            }
        }
        return hash.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
} 