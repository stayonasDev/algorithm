import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 1;

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ;
            if(result == 0)
                break;
            bw.write(result +"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
