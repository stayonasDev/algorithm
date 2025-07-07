import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        boolean[] checkList = new boolean[10];
        int count = 10;

        for(int i=0; i < 10; i++){
            checkList[i] = true;
        }
        for(int i=0; i<10; i++){
            list[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for(int i=0; i< 9; i++){
            int element = list[i];
            for(int j=i + 1; j<10; j++) {
                if (checkList[j] == true) {
                    if (list[j] == element) {
                        checkList[j] = false;
                        count--;
                    }
                }
            }
        }
        System.out.println(count);
    }
}