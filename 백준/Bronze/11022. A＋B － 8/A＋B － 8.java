import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a, b;

		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i < n + 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = st.nextToken();
			b = st.nextToken();
			bw.write("Case #" + i + ": " + a + " + " + b + " = " + (Integer.parseInt(a) + Integer.parseInt(b)) + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}