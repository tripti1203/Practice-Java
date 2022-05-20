import java.io.*;
public class Digit {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		boolean result = hasSharedDigit(start,end);
		System.out.println(result);
	}
	public static boolean hasSharedDigit(int s , int e) {
			
			int lefts = s%10;
			int rights = s/10;
			int lefte = e%10;
			int righte = e/10;
			if(lefts==righte || lefts==lefte || rights==lefte || rights==righte) {
				return true;
			}
			else {
				return false;
			}
	}
}
