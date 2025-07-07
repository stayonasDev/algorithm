import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main{

    static Map<String, Double> map = new HashMap<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        mapConfiguration();
        String[][]  strArray = new String[20][3];
        double[] a = new double[20];
        double totalScore = 0;
        double scoreSum = 0;
        double n = 0;

        for (int i = 0; i < 20; i++) {
            strArray[i] = br.readLine().split(" ");
            if(strArray[i][2].equals("P")){
                continue;
            }else {
                n = Double.parseDouble(strArray[i][1]);
                totalScore +=  n * map.get(strArray[i][2]);
                scoreSum += n;
            }
        }
        System.out.printf("%.6f", totalScore / scoreSum);
    }

    public static void mapConfiguration(){
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
    }
}
