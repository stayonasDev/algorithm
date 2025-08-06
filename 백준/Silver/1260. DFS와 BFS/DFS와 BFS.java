import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    //for-each문에서는 정렬 순대로 되지 않는다 함
    //ArrayList -> Collections.sort() or TreeSet 사용
//    private static PriorityQueue<Integer>[] adjList;
    private static TreeSet<Integer>[] adjSet;
    private static List<Integer> dfsAnswer;
    private static List<Integer> bfsAnswer;
    private static boolean[] dfsVisited;
    private static boolean[] bfsVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");
        int n = Integer.parseInt(info[0]);
        int edge = Integer.parseInt(info[1]);
        int start = Integer.parseInt(info[2]);

        dfsAnswer = new ArrayList<>(n + 1);
        bfsAnswer = new ArrayList<>(n + 1);
        dfsVisited = new boolean[n + 1];
        bfsVisited = new boolean[n + 1];
        adjSet = new TreeSet[n + 1];

        for (int i = 0; i < n + 1; i++) {
            //문제 중 정점 번호가 작은 것 부터 방문하기 때문에 PriorityQueue 사용
//            adjList[i] = new PriorityQueue<>((o1, o2) -> o1.compareTo(o2));
            adjSet[i] = new TreeSet<>();
        }

        //간선만큼 노드들 추가
        for (int i = 0; i < edge; i++) {
            String[] nodes = br.readLine().split(" ");
            int startNode = Integer.parseInt(nodes[0]);
            int endNode = Integer.parseInt(nodes[1]);
            adjSet[startNode].add(endNode);
            //양방향 구현을 위함
            adjSet[endNode].add(startNode);
        }

        dfs(start);
        bfs(start);
        
        //틀린 이유는 출력 문제?
        System.out.println(dfsAnswer.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

        System.out.println(bfsAnswer.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }

    public static void dfs(int start) {
        dfsVisited[start] = true;
        dfsAnswer.add(start);

        for (int next : adjSet[start]) {
            if (!dfsVisited[next])
                dfs(next);
        }
    }

    public static void bfs(int start) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(start);
        bfsVisited[start] = true;

        while (!deque.isEmpty()) {
            int now = deque.poll();
            bfsAnswer.add(now);
            for (int next : adjSet[now]) {
                if (!bfsVisited[next]) {
                    bfsVisited[next] = true;
                    deque.offer(next);
                }
            }
        }
    }
}
