import java.io.*;
public class FACTORS {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		printFactors(num);
	}
	public static void printFactors(int n) {
		if(n<1) {
			System.out.println("INVALID VALUE....");
		}
		else {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					System.out.println(i);
				}
			}
		}
	}
}
