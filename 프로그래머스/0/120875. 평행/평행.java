import java.util.*;


class Solution {
    public double getScope(int x1, int y1, int x2, int y2){
        return (double) (y2 - y1) / (x2 - x1);
    }
    
    public int solution(int[][] dots) {
        double scope1_1 = getScope(dots[0][0], dots[0][1], dots[1][0], dots[1][1]);
        double scope1_2 = getScope(dots[2][0], dots[2][1], dots[3][0], dots[3][1]);
        if(scope1_1 == scope1_2)
            return 1;
        
        double scope2_1 = getScope(dots[0][0], dots[0][1], dots[2][0], dots[2][1]);
        double scope2_2 = getScope(dots[1][0], dots[1][1], dots[3][0], dots[3][1]);
        if(scope2_1 == scope2_2)
            return 1;
        
        double scope3_1 = getScope(dots[0][0], dots[0][1], dots[3][0], dots[3][1]);
        double scope3_2 = getScope(dots[1][0], dots[1][1], dots[2][0], dots[2][1]);
        if(scope3_1 == scope3_2)
            return 1;
        
        return 0;
        }
    }
