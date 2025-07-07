import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] barketList;
        int index, count = 0;
        int num1, num2, temp = 0;

        st = new StringTokenizer(br.readLine());
        index = Integer.parseInt(st.nextToken());
        count = Integer.parseInt(st.nextToken());

        barketList = new int[index];
        for(int i = 0; i < index; i++){
            barketList[i] = i+1;
        }

        for(int i=0; i < count; i++){
            st = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(st.nextToken()) - 1;
            num2  = Integer.parseInt(st.nextToken()) - 1;

            temp = barketList[num1];
            barketList[num1] = barketList[num2];
            barketList[num2] = temp;
        }

        for(int number : barketList){
            System.out.print(number + " ");
        }

        br.close();
    }
}
