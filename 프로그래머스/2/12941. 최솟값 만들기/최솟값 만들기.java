import java.util.Arrays;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B){
        int result = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        
        for(int i = B.length - 1; i >= 0; i--)
            result += A[B.length - 1 - i] * B[i];
        
        return result;
    }
}