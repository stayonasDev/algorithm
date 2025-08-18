import java.util.*;
import java.util.function.*;


class Solution {
    public String solution(String s) {
 Comparator<String> comparator;
        if(s.contains("-")) comparator = (s1, s2) -> s1.charAt(1) - s2.charAt(1);
        else comparator = Comparator.naturalOrder();

        IntSummaryStatistics intSummaryStatistics = Arrays.stream(s.split(" "))
                .sorted(comparator)
                .mapToInt(Integer::parseInt)
                .summaryStatistics();
        return intSummaryStatistics.getMin() + " " + intSummaryStatistics.getMax();
    }
}