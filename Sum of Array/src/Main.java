import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements in the array : ");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		int sum =0;
		for(int i=0;i<n;i++) {
			sum = sum+array[i];
		}
		System.out.println("Sum of array is = " + sum);
	}

}
