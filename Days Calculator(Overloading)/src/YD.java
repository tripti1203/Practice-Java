import java.io.*;
public class YD {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long minutes = Long.parseLong(br.readLine());
		printYearsAndDays(minutes);
	}
	public static void printYearsAndDays(long XX) {
		if(XX<0) {
			System.out.println("INVALID VALUE...");
		}
		else {
			long hour = XX/60;
			long day = XX/24;
			long ZZ = day%365;
			long YY = hour%24;
			System.out.println(XX + " minutes = " + ZZ + " year And " + YY +" days" );
		}
	}
}
