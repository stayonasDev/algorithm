/**
   코드가 이 모양인 이유
   공격을 받기 전 채력은 언제나 max임
   공격을 받은 후 다음 공격 2 - 9 - 1은 회복하는 시간임
   6초 동안은 1초 회복력을 받고 5초의 보너스 회복을 하면 됨, 0이하면 연속으로 맞은거임
**/

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int maxHealth = health;
        int flag = 0;
        int second = 0;
        int remaind;

        
        for(int[] attack : attacks){
            if(flag != 0){
                remaind = (attack[0] - second) - 1;
                
                if(remaind > 0){
                    //초가 아닌 배열에 있는 초당 회복력으로 해야 함
                    health += bandage[1] * remaind;
                    if(remaind >= bandage[0]){
                        //만약 5초 보너스에 5초 * n 만큼 지났다면 n배
                        int count = remaind / bandage[0];
                        health += bandage[2] * count;
                    }
                }
            }
            
            
            if(health > maxHealth)
                health = maxHealth;
            
            health -= attack[1];
            if(0 >= health)
                return -1;
            
            if(flag == 0)
                flag ++;
            
            second = attack[0];
            
        }
        
        return health;
    }
}