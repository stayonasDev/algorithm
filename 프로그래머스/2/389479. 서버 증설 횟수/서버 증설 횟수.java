class Solution {
    public int solution(int[] players, int m, int k) {
        int count = 0;
        int server = 0;
        int[] ttl = new int[players.length * 2];
        
        for(int i = 0; i < players.length; i++){
            if(ttl[i] > 0) server -= ttl[i];
            
            int curCount = players[i] - (server * m);
            
            if(curCount >= m){
                int curServer = curCount / m;
                server += curServer;
                ttl[i + k] = curServer;
                count += curServer;
            }
        }
        return count;
    }
}