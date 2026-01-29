import java.util.*;

class Solution {
    
    private static ArrayList<Integer>[] adjList;
    private static boolean visited[];
    
    public int solution(int n, int[][] computers) {
        int count = 0;
        adjList = new ArrayList[n];
        visited = new boolean[n];
        
        for(int i = 0; i < n; i ++)
            adjList[i] = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j ++){
                if(computers[i][j] == 1 && i != j)
                    adjList[i].add(j);
            }
        }
        
        for(int i = 0; i < n; i ++){
            if(!visited[i]){
                count++;
                countingNetwork(i);
            }
        }
        
        return count;
    }
    
    public static void countingNetwork(int n){
        Deque<Integer> deque = new ArrayDeque();
        deque.offer(n);
        //visited[i] = true;        
        
        while(!deque.isEmpty()){
            int now = deque.poll();
            for(int next : adjList[now]){
                if(!visited[next]){
                    deque.offer(next);
                    visited[next] = true;
                }
            }
        }    
        
    }
}