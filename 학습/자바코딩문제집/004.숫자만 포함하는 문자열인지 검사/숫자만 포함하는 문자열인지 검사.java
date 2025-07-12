import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    private static char[] chArray;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        chArray = br.readLine().toCharArray();
       if(hasDesc())
           System.out.println("숫자만 포함하는 문자열입니다.");
       else
           System.out.println("숫자 외 문자를 포함하는 문자열입니다.");
    }

    public static boolean hasDesc() {
        for (char ch : chArray) {
            if(!(48 <= ch && ch <= 57)) return false;
        }
        return true;
    }
}