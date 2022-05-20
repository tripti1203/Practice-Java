import java.io.*;
public class Last {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		boolean result = hasSameLastDigit(s,e);
		System.out.println(result);
	}
	public static boolean hasSameLastDigit(int start , int end) {
		int lefts= start%10;
		int righte = end%10;
		if(lefts==righte) {
			return true;
		}
		else {
			return false;
		}
	}
}
