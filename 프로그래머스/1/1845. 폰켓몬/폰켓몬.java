import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed()
            .collect(Collectors.toSet());

        int size = nums.length / 2;
        if(size < set.size())
            return size;
        else
            return set.size();
    }
}