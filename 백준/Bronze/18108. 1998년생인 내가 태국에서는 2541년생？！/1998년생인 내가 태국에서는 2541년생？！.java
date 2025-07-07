import java.util.Scanner;

public class Main{
   static void seen(int b){
      if(1000 <= b && b <= 3000){
	     System.out.println(b - 543);
	     }else System.out.println("1000 이상이며 3000이하인 불기 년도를 쓰시오");
	  }
    public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   int bseen = in.nextInt();
   seen(bseen);
    }
}