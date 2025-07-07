import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char tokenValue;
        int value;

        tokenValue = br.readLine().charAt(0);
        value = (int)tokenValue;

        System.out.println(value);
    }
}