import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int random= ThreadLocalRandom.current().nextInt(1,6);
        System.out.print("Enter your number:");
        Scanner scanner= new Scanner(System.in);
	    int num= scanner.nextInt();
	    if(num==random){
	        System.out.println("Correct Aren't you lucky.");
        }
	    else{
	        System.out.println("Wrong answer you get last chance");
	        System.out.print("Enter number :");
	        num =scanner.nextInt();
	        if (num == random) {
	            System.out.println("Correct Arent't you lucky.");
	        }
	        else {
	            System.out.println("Hard luck! Maybe next time.");
	        }
        }
    }
}
