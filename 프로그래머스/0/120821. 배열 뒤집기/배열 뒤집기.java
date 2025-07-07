class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = num_list.clone();
        int length = answer.length- 1;
                for(int i=0; i<length / 2; i++){
            int temp = answer[i];
            answer[i] = answer[length - i];
            answer[length - i] = temp;
        }
        return answer;
    }
}