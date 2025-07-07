import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentence = null;
        int count = 0;

        count = Integer.parseInt(br.readLine());

        for(int i=0; i<count; i++){
            sentence = br.readLine();
            bw.write(sentence.charAt(0)  + "" + sentence.charAt(sentence.length() - 1) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}