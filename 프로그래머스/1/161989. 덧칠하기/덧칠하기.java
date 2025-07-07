class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] flags = new int[n + 1];
        
        for(int idx : section){
            if(flags[idx] != 1){
                answer ++;
                for(int j = 0; j < m; j++){
                    if(j + idx > n)
                        break;
                    flags[idx + j] = 1;                    
            }
            }
        }
        return answer;
    }
}