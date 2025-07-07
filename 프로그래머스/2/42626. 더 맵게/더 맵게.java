import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        Integer[] sc = Arrays.stream(scoville).boxed().toArray(Integer[] :: new);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(sc));
        int count = 0;
        
        while((pq.peek()) < K){
            if(pq.size() <= 1)
                return -1;
            count++;
            pq.add(pq.poll() + (pq.poll() * 2));
        }
        
        return count;
    }
}