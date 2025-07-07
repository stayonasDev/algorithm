import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> bell = new HashMap<>();
        char ascii = 65;
        char[] choice;
        int value = 2;
        int answer = 0;


        for(int i=0; i<=14; i++) {
            if(i % 3 ==0){
                value++;
            }
            bell.put(ascii, value);
            ascii++;
        }
        for(int i=0; i<11; i++){
            if(i ==0 || i == 4 || i == 7){
                value++;
            }
            bell.put(ascii, value);
            ascii++;
        }

        choice = br.readLine().toCharArray();
        for(int i=0; i<choice.length;i++){
            answer += bell.get(choice[i]);
        }
        System.out.println(answer);
        }
    }