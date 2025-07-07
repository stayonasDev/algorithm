import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        StringTokenizer st;
        int count = 0;
        String  str = " ";
        int length = 0;

        st = new StringTokenizer(br.readLine());
        count = Integer.parseInt(st.nextToken());

        st =new StringTokenizer(br.readLine());
        for(int i =0; i < count; i++)
            list.add(Integer.parseInt(st.nextToken()));
        bw.flush();

        st = new StringTokenizer(br.readLine());
        count = Integer.parseInt(st.nextToken());
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == count)
                length++;
        }
        System.out.println(length);

        bw.close();
        br.close();
    }
}
