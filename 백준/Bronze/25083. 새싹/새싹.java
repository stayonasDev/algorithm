import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("         ,r'\"7\n" +"r`-_   ,'  ,/\n" + " \\. \". L_r'\n" + "   `~\\/\n" + "      |\n" + "      |");

        bw.flush();
        bw.close();
    }
}