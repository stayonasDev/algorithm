import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> commandList = new ArrayList<>();
        int start, end;
        
        for(int[] command : commands){
            start = command[0] - 1;
            end = command[1];

            for(; start < end; start++){
                commandList.add(array[start]);
            }
        
            Collections.sort(commandList);
            answer.add(commandList.get(command[2] - 1));
            commandList.clear();
        }

        
        return answer.stream().mapToInt(Integer :: intValue).toArray();
    }
}