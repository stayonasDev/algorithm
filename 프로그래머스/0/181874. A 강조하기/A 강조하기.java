import java.util.*;

class Solution {
    public String solution(String myString) {
        String answer = "a";
        StringBuilder sb = new StringBuilder();
        
        for(String str : myString.split("")){
            if(str.equals("a") || str.equals("A")){
                str = str.toUpperCase();
            }else{
                str = str.toLowerCase();
            }
            sb.append(str);
        }
        return sb.toString();
    }
}