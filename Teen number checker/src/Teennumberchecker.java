import java.util.Scanner;
public class Teennumberchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		boolean result = hasTeen(num1 , num2 , num3 );
		System.out.println(result);
	}
	public static boolean hasTeen(int n1 , int n2 , int n3) {
		if((n1>=13 && n1<=19)||(n2>=13 && n2<=19)||(n3>=13 && n3<=19)) {
			return true;
		}
		else {
			return false;
		}
	}
}
