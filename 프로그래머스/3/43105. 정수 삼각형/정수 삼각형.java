import java.util.Arrays;

class Solution {
    
    private static final int[][] mem = new int[501][501];
    
    public int solution(int[][] triangle) {
        for(int[] row : mem)
            Arrays.fill(row, -1);
        
        return max(0, 0, triangle);
    }
    
    private int max(int x, int y, int[][] triangle){
        if(x == triangle.length) return 0;
        if(mem[x][y] != -1) return mem[x][y];
        
        return mem[x][y] = triangle[x][y] + Math.max(
            max(x + 1, y, triangle),
            max(x + 1, y + 1, triangle));
    }
}