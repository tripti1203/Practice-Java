import java.util.Scanner;
public class Equalsumchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		boolean result = hasEqualSum(num1 , num2 , num3);
		System.out.println(result);
	}
	public static boolean hasEqualSum(int n1 ,int n2 ,int n3) {
		if((n1 + n2) == n3) {
			return true;
		}
		else {
			return false;
		}
	}
}
