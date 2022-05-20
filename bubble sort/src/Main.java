import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the length of an array : ");
	    int num = scanner.nextInt();
	    int[] array = new int[num];
	    int i,j,temp;
	    System.out.println("Enter the elements in the array : ");
	    for(i=0;i<num;i++){
	       array[i] = scanner.nextInt();
        }
	    for(i=0;i<num-1;i++) {
            for (j = 0; j < num-1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
	    System.out.println("The sorted array is : ");
	        for(i=0;i<num;i++)
	        System.out.println(array[i]);
    }
}
