import java.util.Scanner;
public class Decimalcomparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		boolean result = areEqualByThreeDecimalPlaces(num1 , num2);
		System.out.println(result);
	}
	public static boolean areEqualByThreeDecimalPlaces(double n1 , double n2) {
		if((n1*1000) == (n2*1000)) {
			return true;
		}
		else {
			return false;
		}
	}
}
