import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int result = 0;
		
		for(int i=0; i <= num; i++) {
			result += i;
		}
		System.out.println(result);
	}
}