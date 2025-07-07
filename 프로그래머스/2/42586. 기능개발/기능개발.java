import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
        List<Integer> list = new ArrayList<>();
        int count = 1;
        int x = 0;
        int r = 0;
        int day = 0;
        
        //각각 일 수 구하기
        for(int i = 0; i < progresses.length; i++){
            r = 100 - progresses[i];
            day = r / speeds[i];
            if(r % speeds[i] != 0)
                day++;
            days[i] = day;
        }
        
        
        x = days[0];
        for(int i = 1; i < days.length; i++){
            if(x >= days[i]){
                count ++;
            }else {
                list.add(count);
                count = 1;
                x = days[i];
            }
        }
        list.add(count);
        
        
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}