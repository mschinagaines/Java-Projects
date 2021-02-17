import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		
		int hours = days * 24;
		int mins = hours * 60;
		int secs = mins * 60;

		System.out.println(secs);
		
	}
}