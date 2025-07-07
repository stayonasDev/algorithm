import java.util.*;

class Solution {//길이, 재생위치, 오프닝 시작, 끝, 사용자 입력 []
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int time = Integer.parseInt(pos.split(":")[0]) * 60 + 
            Integer.parseInt(pos.split(":")[1]);
        int opStart = Integer.parseInt(op_start.split(":")[0]) * 60 +
            Integer.parseInt(op_start.split(":")[1]);
        int opEnd = Integer.parseInt(op_end.split(":")[0]) * 60 +
            Integer.parseInt(op_end.split(":")[1]);
        int timeEnd = Integer.parseInt(video_len.split(":")[0]) * 60 +
            Integer.parseInt(video_len.split(":")[1]);
        
        time = confirm(time, opStart, opEnd);
        for(String s : commands){
    
            if(s.equals("next")){
                if(time + 10 >= timeEnd)
                    time = timeEnd;
                else
                    time += 10;
            }else{
                if(time-10 <= 0)
                    time = 0;
                else
                    time -= 10;
            }
            time = confirm(time, opStart, opEnd);
        }
        int m = time / 60;
        int s = time % 60;
        return String.format("%02d", m) + ":" + String.format("%02d", s);
    }
    
    public static int confirm(int time, int opStart, int opEnd){
        if(time >= opStart && time <= opEnd){
            time = opEnd;
        }
        return time;
    }
}