import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = scanner.nextInt();
	int i,j,count=0;
	boolean[] isPrime = new boolean[num+1];
	for(i=2;i<=num;i++){
	    isPrime[i]= true;
    }
	for(i=2;i*i<=num;i++){
	    if(isPrime[i]){
	        for(j=i;i*j<=num;j++){
	            isPrime[i*j]=false;
            }
        }
    }
	for(i=2;i<=num;i++){
	    if(isPrime[i]){
	        count++;
        }
    }
	System.out.println("The number of primes = " + count);
    }
}
