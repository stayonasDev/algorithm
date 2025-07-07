import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();

		for (int i = 0; i < count; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}

	}
}