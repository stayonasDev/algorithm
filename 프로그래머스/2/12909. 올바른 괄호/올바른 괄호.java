import java.util.*;

class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char[] array = s.toCharArray();
        
        for(char c : array){
            if(c == ')'){
                if(deque.isEmpty()){
                    return false;
                }else{
                    deque.poll();
                }
            }else
                deque.add(c);
        }
        
        if(deque.isEmpty())
            return true;
        else
            return false;
    }
}