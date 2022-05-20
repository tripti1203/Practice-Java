import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int randomnumber=ThreadLocalRandom.current().nextInt(1,101);
        int guess;
        int guesscount=0;
	do{
	    System.out.print("Enter your guess:");
	    guess= scanner.nextInt();
	    guesscount++;
	    if(guess>randomnumber){
	        System.out.println("LOWER");
        }
	    else if(guess<randomnumber){
	        System.out.println("HIGHER");
        }
	    else{
	        System.out.println("CORRECT");
        }
    }while(guess!=randomnumber);
	System.out.println(guesscount);
    }
}
