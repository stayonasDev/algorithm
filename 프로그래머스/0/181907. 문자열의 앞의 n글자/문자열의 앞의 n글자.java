class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        if(1 <= n && n <= my_string.length()){
            for(int i=0; i < n; i++){
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}