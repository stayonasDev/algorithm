import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[26];
        String text = "";

        for(int i = 0; i < 26; i++){
           list[i] = -1;
        }

        text = br.readLine();
        for(int i=0; i<text.length(); i++){
            if(list[text.charAt(i) - 'a'] == -1) {
                list[text.charAt(i) - 'a'] = i;
            }
        }

        for(int a : list){
            System.out.print(a + " ");
        }
    }
}