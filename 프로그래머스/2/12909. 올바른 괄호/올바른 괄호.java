import java.util.*;

class Solution {
    boolean solution(String s) {
        ArrayDeque<String> stack = new ArrayDeque();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push("(");
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        
        return stack.isEmpty() ? true : false;
    }
}