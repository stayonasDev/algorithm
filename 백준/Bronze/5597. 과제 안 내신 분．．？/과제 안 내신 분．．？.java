import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> checkList = new ArrayList<Integer>(30);

        for(int i=1; i < 31; i++){
            checkList.add(i);
        }

        for(int i=0; i < 28; i++){
            int check = Integer.parseInt(br.readLine());
            int index = checkList.indexOf(check);
            checkList.remove(index);
        }

        for(int uncheck : checkList){
            System.out.println(uncheck);
        }
    }
}