import java.util.Scanner;

public class MultiplicationArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first array");
		int array1[] = new int[4];
		for (int i = 0; i < 4; i++) {
			int element = scanner.nextInt();
			array1[i] = element;
		}
		System.out.println("Enter the second array");
		int array2[] = new int[4];
		for (int i = 0; i < 4; i++) {
			int element = scanner.nextInt();
			array2[i] = element;
		}
		int result[] = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			result[i] = array1[i] * array2[i];
			System.out.println(result[i]);

		}
	}
}
