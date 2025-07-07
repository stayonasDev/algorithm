import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "";

        while(in.hasNextLine()){
            text=in.nextLine();
            if(text.isEmpty()){
                break;
            }
            System.out.println(text);
        }
        in.close();
    }
}