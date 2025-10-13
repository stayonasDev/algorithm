import java.util.Arrays;

class Solution{
    //코드 설명: 제일 작은 값을 구하려면 제일 작은 값을 제일 큰 값과 곱해야 함
    //Sort로 정렬된 A를 정렬된 B의 역순으로 곱함, Big O(N)으로 만들기 위해 For 하나로 
    public int solution(int []A, int []B){
        int result = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = B.length - 1; i >= 0; i--)
            result += A[B.length - 1 - i] * B[i];
        
        return result;
    }
}