import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;

        String temp = br.readLine();
        char[] sentence = temp.toCharArray();

        index = Integer.parseInt(br.readLine());
        System.out.println(sentence[index-1]);
    }
}