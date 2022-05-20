import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("What is your Name? ");
	String userName= scanner.next();
	System.out.println(userName  + " is a nice name. ");

	System.out.println("\nHow old are you? " + userName);
	int userAge= scanner.nextInt();
	System.out.println(" You are " + userAge + " years old ");

	System.out.println("\nWhat is your height in metres? " + userName);
	double userHeight= scanner.nextDouble();
	System.out.println("You are " +userHeight+ " metres tall. ");
	double avgheightofmale= userHeight-1.75;
	double avgheightoffemale= userHeight-1.67;
	System.out.format("%.2f if you are male\n", avgheightofmale);
	System.out.format("%.2f if you are female", avgheightoffemale);
    }
}
