import java.util.*;

class Solution {
    
    private static int[] visitCount;
    private static boolean[] visited;
    private static List<Integer>[] adjList;
    
    public int solution(int n, int[][] edge) {
        adjList = new ArrayList[n + 1];
        visitCount = new int[n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i < n + 1; i++){
            adjList[i] = new ArrayList();
        }
        
        for(int[] nodes : edge){
            adjList[nodes[0]].add(nodes[1]);
            adjList[nodes[1]].add(nodes[0]);
        }
        
        bfs();
        int max = Arrays.stream(visitCount).max().getAsInt();
        int count = 0;
        for(int i = 1; i < visitCount.length; i++){
            if(visitCount[i] == max)
                count++;
        }
        
        return count;
    }
    
    
    public static void bfs(){
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        visited[1] = true;
        
        
        //while로 큐가 빌 때 까지 탐색
        while(!queue.isEmpty()){
            int now = queue.poll();
            for(int next : adjList[now]){
                if(!visited[next]){
                    visited[next] = true;
                    visitCount[next] = visitCount[now] + 1;
                    queue.offer(next);
                }
            }
        }
    }
    
    
}