class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        
        for(int i = 0; i < schedules.length; i++){
            int time = getTime(schedules[i]);
            for(int j = 0; j < 7; j++){
                int check = (startday + j) % 7;
                if(check == 6 || check == 0)
                    continue;
                
                if(timelogs[i][j] > time){
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
    
    public int getTime(int time){
            int hour = time / 100;
            int minute = time % 100 + 10;
            if(minute >= 60){
                minute %= 60;
                hour++;
            }
            return hour * 100 + minute;
    }
}