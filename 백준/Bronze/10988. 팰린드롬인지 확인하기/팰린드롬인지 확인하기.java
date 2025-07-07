import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text;
        int flag = 0;

        text = br.readLine().toCharArray();
        for(int i=0; i<(text.length/2); i++){
            if(text[i] == text[(text.length-1)-i]){
                flag++;
            }else{
                System.out.println(0);
                break;
            }
        }
        if(flag == (text.length/2))
            System.out.println(1);
    }
}