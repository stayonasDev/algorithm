import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int answer = 0;
        int e = 0;
        int size = 0;
        
        deque.add(0);
        for(int i = 0; i < numbers.length; i++){
            size = deque.size();
            
            while(size!=0){
                e = deque.poll();
                deque.add(e + numbers[i]);
                deque.add(e - numbers[i]);
                size--;
            }
        }
        while(!deque.isEmpty()){
            if(deque.poll() == target)
                answer++;
        }
        return answer;
    }
}