import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> offSet = new HashMap<>();
        int[][] tradeArray = new int[friends.length][friends.length];
        int[] giftScore = new int[friends.length];
        int maxScore = 0;
        int score;
        
        for(int i = 0; i < friends.length; i++){
            offSet.put(friends[i], i);
        }
        
        for(String s : gifts){
            String[] trade = s.split(" ");
            tradeArray[offSet.get(trade[0])][offSet.get(trade[1])]++;
            giftScore[offSet.get(trade[0])]++;
            giftScore[offSet.get(trade[1])]--;
        }
        
        for(int i = 0; i < tradeArray.length; i++){
            score = 0;
            
            for(int j = 0; j < tradeArray[i].length; j++){
                if(i == j) continue;
                
                if(tradeArray[i][j] >tradeArray[j][i]){
                    score++;
                }else if(tradeArray[i][j] == tradeArray[j][i] &&
                        giftScore[i] > giftScore[j]){
                    score++;
                }
                
                maxScore = Math.max(maxScore, score);
            }
        }
        //틀린 이유 score --까지 신경 씀
        return maxScore;
    }
}