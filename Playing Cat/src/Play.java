import java.io.*;
public class Play {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean summer = Boolean.parseBoolean(br.readLine());
		int temparature = Integer.parseInt(br.readLine());
		boolean result = isPlaying(summer , temparature);
		System.out.println(result);
	}
	public static boolean isPlaying(boolean summer , int temparature) {
		if(temparature<25 || temparature>35) {
			return false;
		}
		else {
			return true;
		}
	}
}
