import java.util.*;

class Solution {
  
    private static final int[] CY = {0, 0, 1, -1};
    private static final int[] CX = {1, -1, 0, 0};
    private static final Map<String, Integer> MAP =
        Map.of("E", 0, "W", 1, "S", 2, "N", 3); 
    private static int[] idx;
    
    
    public int[] solution(String[] park, String[] routes) {
        
        int y = 0;
        int x = 0;
        
        findIdx(park);
        
        for(String route : routes){
            String[] commend = route.split(" ");
            String orientation = commend[0];
            int dist = Integer.parseInt(commend[1]);
            
            y = idx[0];
            x = idx[1];
            for(int i = 0; i < dist; i++){
                int index = MAP.get(orientation);
                y += CY[index]; 
                x += CX[index];
                
                if((y >= park.length || 0 > y) || 
                   (x >= park[0].length() || 0 > x) ||
                   park[y].charAt(x) == 'X') { //X를 먼저 점검하면 IndexOut
                    y = idx[0];
                    x = idx[1];
                    break;
                }
            }
            idx[0] = y;
            idx[1] = x;
        }
            
        return idx;
    }
    
    public void findIdx(String[] park){
        for(int i = 0; i < park.length; i++){
            int num = park[i].indexOf("S");
            if(num >= 0){
                idx = new int[]{i, num};
                break;
            }
        }
 
    }
}