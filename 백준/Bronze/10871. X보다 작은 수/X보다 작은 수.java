import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int count = 0, find = 0;

        st = new StringTokenizer(br.readLine());
        count = Integer.parseInt(st.nextToken());
        find = Integer.parseInt(st.nextToken());
        int[] list = new int[count];

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<count; i++){
                list[i] = Integer.parseInt(st.nextToken());
                if(list[i] <find)
                    bw.write(list[i] + " ");
            }
            bw.flush();
            br.close();
            bw.close();
    }
}