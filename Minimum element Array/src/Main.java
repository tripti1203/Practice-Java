import java.util.*;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Count =scanner.nextInt();
		int[] returnedInteger = readIntegers(Count);
		int minimumElement = findMin(returnedInteger);
		System.out.println("Minimun value obtained : " + minimumElement);
	}
	public static int[] readIntegers(int Count) {
		int[] array = new int[Count];
		System.out.println("Enter a number : ");
		for(int i=0;i<array.length;i++) {
			int number = scanner.nextInt();
			scanner.nextLine();
			array[i] = number;
		}
		return array;
	}
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i =0; i<array.length;i++) {
			int value = array[i];
			if(value<min) {
				min=value;
			}
		}
		return min;
	}
}
