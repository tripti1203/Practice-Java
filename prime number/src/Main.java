import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	int i;
	boolean flag = false;
	System.out.println("Enter the number :");
	int num= scanner.nextInt();
	for(i=2;i<=num;i++){
	    if(num%i==0){
	        flag=true;
	        break;
        }
    }
	if(!flag){
	    System.out.println(num + " is a prime number");
    }
	else{
	    System.out.println(num + "is not a prime number");
    }
    }
}
