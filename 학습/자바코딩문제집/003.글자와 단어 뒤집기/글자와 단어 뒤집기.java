import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strArray = new ArrayList<>();

        //입력을 받고 글자 단위로 str에 저장
        for(String str : br.readLine().split(" ")){
            StringBuilder sb = new StringBuilder();

            //단어 별로 글자를 뒤집는 로직 Big O(N)
            for (int i = str.length() - 1; 0 <= i; i--) {
                sb.append(str.charAt(i));
            }
            strArray.add(sb.toString());
        }

        System.out.println("각 글자를 뒤집었습니다. \n" + strArray.toString() + "\n");

        //글자 별로 뒤집는다
        Collections.reverse(strArray);

        System.out.println("각 글자와 각 단어를 뒤집었습니다. \n" + strArray.toString());
    }
}