import java.util.Scanner;

public class ArrayScanFor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	

		int [] numlist = new int[3];
		
		for(int i=0; i<numlist.length; i++) {
			System.out.println("Input 3 numbers");
			numlist[1] = scanner.nextInt();
		}

		for(int i =0; i<3; i++) {
			System.out.println(numlist[i]);
		}

		scanner.close();
	}
}

