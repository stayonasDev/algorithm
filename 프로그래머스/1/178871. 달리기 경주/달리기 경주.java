import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> keyPlayer = new HashMap<>();
        Map<Integer, String> keyScore = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            keyPlayer.put(players[i], i+1);
            keyScore.put(i+1, players[i]);
            }
        
        for(String c : callings){
            int score = keyPlayer.get(c);
            String player = keyScore.get(score-1);
            keyPlayer.put(c ,score-1);
            keyPlayer.put(player, score);
            keyScore.put(score -1, c);
            keyScore.put(score, player);
        }
        
        for(int i=0; i<players.length; i++){
            answer[i] = keyScore.get(i+1);
        }
        return answer;
    }
}