import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		boolean Lyear = isLeapYear(year);
		System.out.println(Lyear);
	}
	public static boolean isLeapYear( int Year) {
		if(Year<=1 || Year>=9999) {
			return false;
		}
		else if((Year%4==0) && (Year%100!=0) || (Year%400==0)) {
			return true;
		}
		else {
			System.out.println(Year + " is not a leap year");
			return false;
		}
	}

}
