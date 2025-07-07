class Solution {
    public int solution(int n, int w, int num) {
        int h = ((num - 1)/w) + 1;
        int cntW = (h % 2 == 1) ? (num-1)%w+1 : h*w-num+1;
        
        int now = num;
        int cnt = 0;
        
        while(now <= n){
            cnt++;
            
            if((h + cnt) % 2 == 0) now += w * 2 - (cntW * 2 - 1);
            else now += cntW * 2 - 1;
        }                                                                   
        return cnt;
    }
}