import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int[] list = null;
        int index = 0;
        int count = 0;

        st = new StringTokenizer(br.readLine());
        index = Integer.parseInt(st.nextToken());
        count = Integer.parseInt(st.nextToken());

        list = new int[index];
        for(int i=0; i<index; i++){
            list[i] = i+1;
        }

        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int firstIndex = (Integer.parseInt(st.nextToken())) -1;
            int lastIndex = (Integer.parseInt(st.nextToken())) -1;

            while(firstIndex < lastIndex){
                    int temp = list[firstIndex];
                    list[firstIndex] = list[lastIndex] ;
                    list[lastIndex] = temp;
                    firstIndex++;
                    lastIndex--;
                }
            }
        for(int element : list){
            System.out.print(element + " ");
        }
    }
}