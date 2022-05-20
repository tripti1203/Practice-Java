import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Total bill:");
	double bill= scanner.nextDouble();
	System.out.println("Enter no. of people :");
	int people= scanner.nextInt();

	double equalpay= bill/people;
	System.out.format("Each person has to pay : Rs%.2f",equalpay);
    }
}
