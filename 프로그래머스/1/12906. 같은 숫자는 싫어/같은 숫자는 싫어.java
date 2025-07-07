import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        int size;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        size = stack.size();
        answer = new int[size];
        for(int i = 0; i < size; i++){
            answer[size - i - 1] = stack.pop();
        }
        return answer;
    }
}