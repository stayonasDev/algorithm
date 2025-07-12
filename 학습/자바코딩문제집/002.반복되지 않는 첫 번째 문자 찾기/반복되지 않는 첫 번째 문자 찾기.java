import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split("");
        HashMap<String, Integer> map = new HashMap<>();
        String answer =  "";

        for (String str : array) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (String str : array) {
            if(map.get(str) == 1){
                answer = str;
                break;
            }
        }

        System.out.println(answer.isEmpty() ? "반복되지 않는 문자는 없습니다." : "반복되지 않는 문자를 찾았습니다. >> " + answer);
    }
}