import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String kroatia = br.readLine();
        int answer = 0;

        for (int i = 0; i < kroatia.length(); i++) {
            if (i < kroatia.length() - 1 && kroatia.startsWith("c=", i)) {
                answer++;
                i ++;
            } else if (i < kroatia.length() - 1 && kroatia.startsWith("c-", i)) {
                answer++;
                i++;
            } else if (i < kroatia.length() - 2 && kroatia.startsWith("dz=", i)) {
                answer++;
                i += 2;
            } else if (i < kroatia.length() - 1 && kroatia.startsWith("d-", i)) {
                answer++;
                i++;
            } else if (i < kroatia.length() - 1 && kroatia.startsWith("lj", i)) {
                answer++;
                i++;
            } else if (i < kroatia.length() - 1 && kroatia.startsWith("nj", i)) {
                answer++;
                i++;
            } else if (i < kroatia.length() - 1 && kroatia.startsWith("s=", i)) {
                answer++;
                i++;
            } else if (i < kroatia.length() - 1 && kroatia.startsWith("z=", i)) {
                answer++;
                i++;
            } else {
                answer++;
            }
        }

        System.out.println(answer);
    }
}