import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements to be inserted in an array :");
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the number :");
			int number = scanner.nextInt();
			scanner.nextLine();
			array[i]=number;
		}
		System.out.println("Before reversing---------->");
		for(int i=0;i<n;i++) {
			System.out.print( array[i] + " ");
		}
		System.out.println();
		System.out.println("After reversing---------->");
		for(int i=n-1;i>=0;i--) {
			System.out.print( array[i] + " ");
		}
				
	}
}