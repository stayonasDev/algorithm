class Solution {
    public int solution(int angle) {
        int answer = 1;
        for(int i=0; i <= 180; i += 90){
            if(i < angle && angle < i+90)
                return answer;
            answer+= 1;
            if(i+90 == angle)
                return answer;
            answer+= 1;
        }
        return answer;
    }
}