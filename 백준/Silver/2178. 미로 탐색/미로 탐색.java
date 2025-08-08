import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    private final static int[] rx = {0, 0, -1, 1};
    private final static int[] ry = {1, -1, 0, 0};
    private static boolean[][] visited;
    private static int[][] costMap;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Node> queue = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rowIndex = Integer.parseInt(st.nextToken());
        int colIndex = Integer.parseInt(st.nextToken());
        costMap = new int[rowIndex][colIndex];
        char[][] maps = new char[rowIndex][colIndex];
        visited = new boolean[rowIndex][colIndex];

        for (int i = 0; i < rowIndex; i++) {
            maps[i] = br.readLine().toCharArray();
        }

        queue.offer(new Node(0, 0));
        costMap[0][0] = 1;

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            for (int i = 0; i < 4; i++) {
                int cx = currentNode.x + rx[i];
                int cy = currentNode.y + ry[i];



                if ((cx < 0 || cy < 0) || (cx >= rowIndex || cy >= colIndex))
                    continue;

                if(visited[cx][cy])
                    continue;

                if (maps[cx][cy] == '1') {
                    costMap[cx][cy] = costMap[currentNode.x][currentNode.y] + 1;
                    queue.offer(new Node(cx, cy));
                    visited[cx][cy] = true;
                }

                if(cx == rowIndex-1 && cy == colIndex-1)
                    break;
            }
        }
        System.out.println(costMap[rowIndex-1][colIndex-1]);

    }

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
