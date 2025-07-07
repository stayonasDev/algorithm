import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String number1 ="";
        String number2 = "";
        String result = "";

        st = new StringTokenizer(br.readLine());
        number1 = st.nextToken();
        number2 = st.nextToken();

        for(int i=2; i>=0; i--) {
            if (number1.charAt(i) > number2.charAt(i)) {
                result = number1;
                break;
            } else if(number2.charAt(i) > number1.charAt(i)) {
                result = number2;
                break;
            }
        }
        System.out.printf("%s%s%s", result.charAt(2), result.charAt(1), result.charAt(0));
        }
    }