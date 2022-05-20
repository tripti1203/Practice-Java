import java.util.*;
public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scanner.nextInt();
		int[] array = new int[n];
		Array(array);
	
		Display(array);
	
		Remove(array);

	}

	
	public static void Array(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			System.out.print("Enter the numbers :");
			array[i]= scanner.nextInt();
		}
	}
	
	public static void Display(int[] array) {
		if(array.length==0) {
			System.out.println("Array is empty.......");
		}
		else {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i] + " ");
		System.out.println();
		}
	}
	
	public static void Remove(int[] array) {
		if(array.length==0) {
			System.out.println("All elements are deleted......");
		}
		else {
			for(int i=0;i<array.length;i++) {
			System.out.println("Enter the position of element to be deleted : ");
			int key = scanner.nextInt();
			
				if(array[i]==key) {
					for(int j=i;j<array.length;j++) {
						array[j] = array[j+1];
					}
				}
				else {
					System.out.println("ELement not found......");
				}
			}
		}
	}
}


