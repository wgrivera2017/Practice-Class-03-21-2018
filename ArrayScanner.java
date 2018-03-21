import java.util.Scanner;
public class ArrayScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input 3 numbers");

		int [] numlist = new int[3];

		numlist[0] = scanner.nextInt();
		numlist[1] = scanner.nextInt();
		numlist[2] = scanner.nextInt();

		for(int i =0; i<3; i++) {
			System.out.println(numlist[i]);
		}

		scanner.close();
	}

}
