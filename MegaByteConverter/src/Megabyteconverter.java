import java.util.Scanner;
public class Megabyteconverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int kb = scanner.nextInt();
		printMegaByteAndKiloByte(kb);
	}
	public static void printMegaByteAndKiloByte(int kilobytes) {
		if(kilobytes<0) {
			System.out.println("Invalid...");
		}
		else {
			int mb = kilobytes/1024;
			int remainingKiloBytes = kilobytes%1024;
			System.out.println(kilobytes + " KB = " + mb + " MB And " + remainingKiloBytes + " KB");
		}
	}

}
