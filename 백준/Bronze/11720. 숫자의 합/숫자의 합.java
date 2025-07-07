import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numList = new ArrayList<>();
        int count = 0;
        char[] list;

        count = Integer.parseInt(br.readLine());
        list = br.readLine().toCharArray();

        for(int i=0; i<count; i++){
            numList.add((int)(list[i] - '0'));
        }

        System.out.println(numList.stream().mapToInt(i -> i).sum());
    }
}