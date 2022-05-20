import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Enter the length of the array...");
	Scanner scanner = new Scanner(System.in);
	int length = scanner.nextInt();
	double[] arr= new double[length];
	int i;
	for(i=0;i<length;i++){
	    arr[i]= Math.random()*41+10;
    }
	for(i=0;i<length;i++){
	    System.out.print(arr[i] + " ");
    }
	System.out.println();
	double max= Double.NEGATIVE_INFINITY;
	for(i=0;i<length;i++){
	    if(arr[i]>max){
	        max = arr[i];
        }
    }
	System.out.println("Maximun element in an array is : " + max);

	double sum=0.0;
	for(i=0;i<length;i++){
	    sum+=arr[i];
    }
	double average= sum/length;
	System.out.println("Average = " + average);
    }
}
