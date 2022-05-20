import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("First name:");
	String userName= scanner.next();

	System.out.println("Your Age:");
	int userAge= scanner.nextInt();

	System.out.print("Amount of money you have: $");
	double money= scanner.nextDouble();

	double moneyneeded= Math.ceil(money)-money;

	System.out.println("Your name is " +userName+ ". Your Name is "+ userName.length() +" characters long.");
	System.out.println("You've lived "+userAge+"years. In another "+userAge+" years you'll be "+ 2*userAge+" years old.");
	System.out.format("You have $%.2f on you and need $%.2f",money,moneyneeded);
    }
}
