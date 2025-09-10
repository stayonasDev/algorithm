import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set =  new HashSet<>();

        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            set.add(sc.nextInt());
        }
        set.stream().sorted().forEach(System.out::println);
    }
}