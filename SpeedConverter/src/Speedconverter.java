import java.util.Scanner;
public class Speedconverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 double km = scanner.nextDouble();
		 double miles = toMilesPerHour(km);
		 long milesRounded = Math.round(miles);
		 System.out.println(milesRounded);
	}
	public static double toMilesPerHour(double kilometerPerHour) {
		if(kilometerPerHour<0) {
			return -1;
		}
		else {
			double miles = kilometerPerHour/1.60934;
			return miles;
		}
	}
}
